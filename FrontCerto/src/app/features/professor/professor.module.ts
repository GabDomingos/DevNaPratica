import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProfessorFormComponent } from './views/professor-form/professor-form.component';
import { ProfessorListComponent } from './views/professor-list/professor-list.component';
import { ProfessorRouterModule } from './professor.routing';
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
import { ProfessorResolver } from './views/professor-form/professor.resolver';

@NgModule({
  declarations: [ProfessorFormComponent, ProfessorListComponent],
  imports: [
    CommonModule,
    ProfessorRouterModule,
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
    ProfessorResolver
  ]
})
export class ProfessorModule { }
