import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AvaliacaoFormComponent } from './views/avaliacao-form/avaliacao-form.component';
import { AvaliacaoListComponent } from './views/avaliacao-list/avaliacao-list.component';
import { AvaliacaoRouterModule } from './avaliacao.routing';
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
import { AvaliacaoResolver } from './views/avaliacao-form/avaliacao.resolver';

@NgModule({
  declarations: [AvaliacaoFormComponent, AvaliacaoListComponent],
  imports: [
    CommonModule,
    AvaliacaoRouterModule,
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
    AvaliacaoResolver
  ]
})
export class AvaliacaoModule { }
