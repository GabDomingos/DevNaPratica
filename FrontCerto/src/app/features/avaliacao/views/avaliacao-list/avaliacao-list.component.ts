import { Component, OnInit } from '@angular/core';
import { AvaliacaoService } from 'src/app/core/entities/avaliacao/avaliacao.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Avaliacao } from 'src/app/core/entities/avaliacao/avaliacao';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-avaliacao-list',
  templateUrl: './avaliacao-list.component.html',
  styleUrls: ['./avaliacao-list.component.scss']
})
export class AvaliacaoListComponent implements OnInit {

  avaliacaos: Avaliacao[];
  columns: any[];

  constructor(
    private avaliacaoService: AvaliacaoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.avaliacaoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.avaliacaos = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dtAvaliacao', header: 'Data de Avaliação' },
      { field: 'nota', header: 'Nota' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Avaliacao) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/avaliacao/create'], { relativeTo: this.route });
  }

  public editItem(avaliacao: Avaliacao) {
    this.router.navigate([`/avaliacao/edit/${avaliacao.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.avaliacaoService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.avaliacaos = this.avaliacaos.filter(avaliacao => avaliacao.id !== id);
      this.avaliacaos.find((avaliacao: Avaliacao) => avaliacao.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Avaliacao ${nome} deletado!`
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
