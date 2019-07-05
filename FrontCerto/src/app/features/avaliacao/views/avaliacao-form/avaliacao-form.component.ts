import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Avaliacao } from 'src/app/core/entities/avaliacao/avaliacao';
import { AvaliacaoService } from 'src/app/core/entities/avaliacao/avaliacao.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-avaliacao-form',
  templateUrl: './avaliacao-form.component.html',
  styleUrls: ['./avaliacao-form.component.scss']
})
export class AvaliacaoFormComponent implements OnInit {
  public avaliacaoForm: FormGroup;
  @Input() avaliacao: Avaliacao;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private avaliacaoService: AvaliacaoService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.avaliacaoForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      nota: new FormControl(undefined, Validators.compose([Validators.required])),
    });
  }

  private validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
        const control = formGroup.get(field);
        if (control instanceof FormControl) {
          control.markAsDirty({ onlySelf: true });
        } else if (control instanceof FormGroup) {
          this.validateAllFormFields(control);
        }
    });
  }

  public onSave() {
    if (!this.avaliacaoForm.valid) {
      return this.validateAllFormFields(this.avaliacaoForm);
    }

    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/avaliacao/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Avaliacao.fromDto(entity);
        this.avaliacaoForm.patchValue(value);
    } else {
        this.avaliacaoForm.patchValue(new Avaliacao());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.avaliacaoForm;
    const avaliacaoDto = Avaliacao.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.avaliacaoService.insert(avaliacaoDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `A avaliacao foi inserida com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.avaliacaoService.update(id, avaliacaoDto);
    }

    return observable;
  }

}
