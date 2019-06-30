/* Database: PostgreSql. Generation date: 2019-06-29 11:28:37:984 */
/* Entity Professor */
create table professor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_contratacao DATE NOT NULL /* dataContratacao */,
	salario NUMERIC(19,4) NOT NULL
);



/* Entity Aluno */
create table aluno (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_inicio DATE NOT NULL /* dataInicio */
);



/* Entity Turma */
create table turma (
	id UUID NOT NULL,
	desc_turma VARCHAR(255) NOT NULL /* descTurma */,
	horario TIME NOT NULL,
	valor_mensalidade NUMERIC(19,4) NOT NULL /* valorMensalidade */,
	limite_alunos NUMERIC(19) NOT NULL /* limiteAlunos */
);



/* Entity Avaliacao */
create table avaliacao (
	id UUID NOT NULL,
	desc_nota VARCHAR(255) NOT NULL /* descNota */,
	nota NUMERIC(19,4) NOT NULL,
	data_avaliacao DATE NOT NULL /* dataAvaliacao */
);



/* Join Tables */
/* master: Professor as professor, detail: Turma as turma */
create table professor_turmas (
	professor_id UUID NOT NULL,
	turmas_id UUID NOT NULL
);

/* master: Aluno as aluno, detail: Avaliacao as avaliacao */
create table aluno_notas (
	aluno_id UUID NOT NULL,
	notas_id UUID NOT NULL
);

/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id UUID NOT NULL,
	alunos_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table professor_turmas add constraint pk_professor_turmas primary key(professor_id, turmas_id);
alter table professor add constraint pk_professor_id primary key(id);
alter table aluno_notas add constraint pk_aluno_notas primary key(aluno_id, notas_id);
alter table aluno add constraint pk_aluno_id primary key(id);
alter table turma_alunos add constraint pk_turma_alunos primary key(turma_id, alunos_id);
alter table turma add constraint pk_turma_id primary key(id);
alter table avaliacao add constraint pk_avaliacao_id primary key(id);

/* Foreign Key Constraints */
alter table professor_turmas add constraint fkpd9taczpbpmqtivmv4n5bgjxp4lj foreign key (professor_id) references professor (id);
alter table professor_turmas add constraint fk7dihcwpvjb6tho6k6xzqiah09jlc foreign key (turmas_id) references turma (id);
alter table aluno_notas add constraint fk0qap5lqstxnzfo0grinmx9y8upks foreign key (aluno_id) references aluno (id);
alter table aluno_notas add constraint fkzwrcra6zad6epz05zohqwqxzgbtl foreign key (notas_id) references avaliacao (id);
alter table turma_alunos add constraint fkctepmdcwrllkltrjjrbasvdbngd4 foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkjpttwg8rrjw6j5iusehou0dssc1i foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
