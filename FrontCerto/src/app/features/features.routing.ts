import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
{
  path: 'professor', redirectTo: 'professor/list'
},
{
  path: 'aluno', redirectTo: 'aluno/list'
},
{
  path: 'turma', redirectTo: 'turma/list'
},
{
  path: 'avaliacao', redirectTo: 'avaliacao/list'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule { }
