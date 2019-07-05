import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AvaliacaoFormComponent } from './views/avaliacao-form/avaliacao-form.component';
import { AvaliacaoListComponent } from './views/avaliacao-list/avaliacao-list.component';
import { AvaliacaoResolver } from './views/avaliacao-form/avaliacao.resolver';

const routes: Routes = [{
  path: 'avaliacao',  children: [
    {
      path: 'create', component: AvaliacaoFormComponent
    },
    {
      path: 'list', component: AvaliacaoListComponent
    },
    {
      path: 'edit/:id', component: AvaliacaoFormComponent, resolve: [AvaliacaoResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AvaliacaoRouterModule { }
