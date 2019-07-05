import * as moment from 'moment';
import { AlunoDto } from './aluno-dto';

export class Aluno {
    public id?: string;
    public nome: string;
    public dtNascimento: string;

    public static fromDto(alunoDto: AlunoDto, originEntity?: string): Aluno {
        const model: any = { ...alunoDto };

        model.dtNascimento = model.dtNascimento && moment(model.dtNascimento).toDate();

        return model as Aluno;
    }

    public static toDto(aluno: Aluno, originEntity?: string): AlunoDto {
        const dto: any = { ...aluno };

        dto.dtNascimento = dto.dtNascimento && moment(dto.dtNascimento).format('YYYY-MM-DD');

        delete dto.label;

        return dto;
    }
}
