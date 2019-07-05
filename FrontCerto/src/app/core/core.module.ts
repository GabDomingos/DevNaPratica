import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProfessorModule } from './entities/professor/professor.module';
import { AlunoModule } from './entities/aluno/aluno.module';
import { TurmaModule } from './entities/turma/turma.module';
import { AvaliacaoModule } from './entities/avaliacao/avaliacao.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ProfessorModule,
    AlunoModule,
    TurmaModule,
    AvaliacaoModule
  ]
})
export class CoreModule { }
