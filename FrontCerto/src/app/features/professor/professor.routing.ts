import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfessorFormComponent } from './views/professor-form/professor-form.component';
import { ProfessorListComponent } from './views/professor-list/professor-list.component';
import { ProfessorResolver } from './views/professor-form/professor.resolver';

const routes: Routes = [{
  path: 'professor',  children: [
    {
      path: 'create', component: ProfessorFormComponent
    },
    {
      path: 'list', component: ProfessorListComponent
    },
    {
      path: 'edit/:id', component: ProfessorFormComponent, resolve: [ProfessorResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ProfessorRouterModule { }
