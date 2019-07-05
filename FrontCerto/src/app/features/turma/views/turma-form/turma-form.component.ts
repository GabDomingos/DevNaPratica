import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Turma } from 'src/app/core/entities/turma/turma';
import { TurmaService } from 'src/app/core/entities/turma/turma.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-turma-form',
  templateUrl: './turma-form.component.html',
  styleUrls: ['./turma-form.component.scss']
})
export class TurmaFormComponent implements OnInit {
  public turmaForm: FormGroup;
  @Input() turma: Turma;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private turmaService: TurmaService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.turmaForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      horario: new FormControl(undefined, Validators.compose([Validators.required])),
      valorMensalidade: new FormControl(undefined, Validators.compose([Validators.required])),
      limiteDeAlunos: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.turmaForm.valid) {
      return this.validateAllFormFields(this.turmaForm);
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
    const previousRoute = '/turma/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Turma.fromDto(entity);
        this.turmaForm.patchValue(value);
    } else {
        this.turmaForm.patchValue(new Turma());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.turmaForm;
    const turmaDto = Turma.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.turmaService.insert(turmaDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O turma foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.turmaService.update(id, turmaDto);
    }

    return observable;
  }

}
