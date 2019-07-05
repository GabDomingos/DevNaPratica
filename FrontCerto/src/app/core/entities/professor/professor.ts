import * as moment from 'moment';
import { ProfessorDto } from './professor-dto';

export class Professor {
    public id?: string;
    public nome?: string;
    public dtNascimento?: string;
    public dtContratacao?: string;
    public salario?: number;

    public static fromDto(professorDto: ProfessorDto, originEntity?: string): Professor {
        const model: any = { ...professorDto };

        model.dtNascimento = model.dtNascimento && moment(model.dtNascimento).toDate();
        model.dtContratacao = model.dtContratacao && moment(model.dtContratacao).toDate();

        return model as Professor;
    }

    public static toDto(professor: Professor, originEntity?: string): Professor {
        const dto: any = { ...professor };

        dto.dtNascimento = dto.dtNascimento && moment(dto.dtNascimento).format();
        dto.dtContratacao = dto.dtContratacao && moment(dto.dtContratacao).format();

        delete dto.label;

        return dto;
    }
}
