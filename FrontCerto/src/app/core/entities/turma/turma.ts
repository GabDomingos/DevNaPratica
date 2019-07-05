import * as moment from 'moment';
import { TurmaDto } from './turma-dto';

export class Turma {
    public id?: string;
    public descricao?: string;
    public horario?: string;
    public valorMensalidade?: string;
    public limiteDeAlunos?: string;

    public static fromDto(turmaDto: TurmaDto, originEntity?: string): Turma {
        const model: any = { ...turmaDto };

        return model as Turma;
    }

    public static toDto(turma: Turma, originEntity?: string): TurmaDto {
        const dto: any = { ...turma };

        delete dto.label;

        return dto;
    }
}
