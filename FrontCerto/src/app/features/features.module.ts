import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { RouterModule } from '@angular/router';
import { ProfessorModule } from './professor/professor.module';
import { AlunoModule } from './aluno/aluno.module';
import { AvaliacaoModule } from './avaliacao/avaliacao.module';
import { TurmaModule } from './turma/turma.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    ProfessorModule,
    AlunoModule,
    AvaliacaoModule,
    TurmaModule
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
