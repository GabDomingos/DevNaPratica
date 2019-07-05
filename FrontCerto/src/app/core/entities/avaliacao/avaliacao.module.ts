import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { AvaliacaoService } from './avaliacao.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'avaliacao',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/avaliacao`,
            },
        ]),
    ],
    providers: [
      AvaliacaoService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class AvaliacaoModule {}
