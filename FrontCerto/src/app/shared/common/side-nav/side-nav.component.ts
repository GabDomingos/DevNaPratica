import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  items = [
    {
      label: 'Professor',
      routerLink: '/professor'
    },
    {
      label: 'Aluno',
      routerLink: '/aluno'
    },
    {
      label: 'Turma',
      routerLink: '/turma'
    },
    {
      label: 'Avaliacao',
      routerLink: '/avaliacao'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
