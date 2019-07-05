import * as moment from 'moment';
import { AvaliacaoDto } from './avaliacao-dto';

export class Avaliacao {
    public id?: string;
    public nota?: string;
    public descricao?: string;
    public dtAvaliacao?: string;

    public static fromDto(avaliacaoDto: AvaliacaoDto, originEntity?: string): Avaliacao {
        const model: any = { ...avaliacaoDto };

        model.dtAvaliacao = model.dtAvaliacao && moment(model.dtAvaliacao).toDate();

        return model as Avaliacao;
    }

    public static toDto(avaliacao: Avaliacao, originEntity?: string): AvaliacaoDto {
        const dto: any = { ...avaliacao };

        dto.dtAvaliacao = dto.dtAvaliacao && moment(dto.dtAvaliacao).format('YYYY-MM-DD');

        delete dto.label;

        return dto;
    }
}
