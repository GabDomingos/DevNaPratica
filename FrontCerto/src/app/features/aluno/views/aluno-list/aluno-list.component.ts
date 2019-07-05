import { Component, OnInit } from '@angular/core';
import { AlunoService } from 'src/app/core/entities/aluno/aluno.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Aluno } from 'src/app/core/entities/aluno/aluno';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-aluno-list',
  templateUrl: './aluno-list.component.html',
  styleUrls: ['./aluno-list.component.scss']
})
export class AlunoListComponent implements OnInit {

  alunos: Aluno[];
  columns: any[];

  constructor(
    private alunoService: AlunoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.alunoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.alunos = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataNascimento', header: 'Data de Nascimento' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Aluno) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/aluno/create'], { relativeTo: this.route });
  }

  public editItem(aluno: Aluno) {
    this.router.navigate([`/aluno/edit/${aluno.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.alunoService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.alunos = this.alunos.filter(aluno => aluno.id !== id);
      this.alunos.find((aluno: Aluno) => aluno.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Aluno ${nome} deletado!`
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
