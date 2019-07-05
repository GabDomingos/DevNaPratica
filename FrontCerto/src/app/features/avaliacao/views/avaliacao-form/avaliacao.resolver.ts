import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Avaliacao } from 'src/app/core/entities/avaliacao/avaliacao';
import { AvaliacaoService } from 'src/app/core/entities/avaliacao/avaliacao.service';


@Injectable()
export class AvaliacaoResolver implements Resolve<Avaliacao []> {

    constructor(private service: AvaliacaoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
