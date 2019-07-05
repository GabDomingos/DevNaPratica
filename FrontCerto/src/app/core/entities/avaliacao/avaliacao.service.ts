import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { AvaliacaoDto } from './avaliacao-dto';
import { EntityService } from '../entity-service';


@Injectable()
export class AvaliacaoService extends EntityService<AvaliacaoDto> {

    constructor(protected http: HttpClient, protected messageService: MessageService) {
        super(
            http,
            `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/avaliacao`
        );
    }
}
