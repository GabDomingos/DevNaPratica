import { Component, OnInit } from '@angular/core';
import { ProfessorService } from 'src/app/core/entities/professor/professor.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Professor } from 'src/app/core/entities/professor/professor';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-professor-list',
  templateUrl: './professor-list.component.html',
  styleUrls: ['./professor-list.component.scss']
})
export class ProfessorListComponent implements OnInit {

  professors: Professor[];
  columns: any[];

  constructor(
    private professorService: ProfessorService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.professorService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.professors = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dtNascimento', header: 'Data de Nascimento' },
      { field: 'dtContratacao', header: 'Data de Contratacao' },
      { field: 'salario', header: 'Salario' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Professor) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/professor/create'], { relativeTo: this.route });
  }

  public editItem(professor: Professor) {
    this.router.navigate([`/professor/edit/${professor.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.professorService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.professors = this.professors.filter(professor => professor.id !== id);
      this.professors.find((professor: Professor) => professor.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Professor ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch() {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: 'Erro!',
            detail: `Erro ao carregar a lista!`
          });
        }
        return throwError(err);
      });
  }

}
