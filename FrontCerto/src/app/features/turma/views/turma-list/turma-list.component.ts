import { Component, OnInit } from '@angular/core';
import { TurmaService } from 'src/app/core/entities/turma/turma.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Turma } from 'src/app/core/entities/turma/turma';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-turma-list',
  templateUrl: './turma-list.component.html',
  styleUrls: ['./turma-list.component.scss']
})
export class TurmaListComponent implements OnInit {

  turmas: Turma[];
  columns: any[];

  constructor(
    private turmaService: TurmaService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.turmaService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.turmas = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'horario', header: 'Horario' },
      { field: 'valorMensalidade', header: 'Valor mensalidade' },
      { field: 'limiteDeAluno', header: 'Limite de Aluno' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Turma) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/turma/create'], { relativeTo: this.route });
  }

  public editItem(turma: Turma) {
    this.router.navigate([`/turma/edit/${turma.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.turmaService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.turmas = this.turmas.filter(turma => turma.id !== id);
      this.turmas.find((turma: Turma) => turma.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Turma ${nome} deletado!`
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
