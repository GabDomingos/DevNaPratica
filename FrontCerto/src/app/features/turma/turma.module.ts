import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TurmaFormComponent } from './views/turma-form/turma-form.component';
import { TurmaListComponent } from './views/turma-list/turma-list.component';
import { TurmaRouterModule } from './turma.routing';
import { TableModule } from 'primeng/table';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageService } from 'primeng/api';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { TurmaResolver } from './views/turma-form/turma.resolver';

@NgModule({
  declarations: [TurmaFormComponent, TurmaListComponent],
  imports: [
    CommonModule,
    TurmaRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule
  ],
  providers: [
    MessageService,
    TurmaResolver
  ]
})
export class TurmaModule { }
