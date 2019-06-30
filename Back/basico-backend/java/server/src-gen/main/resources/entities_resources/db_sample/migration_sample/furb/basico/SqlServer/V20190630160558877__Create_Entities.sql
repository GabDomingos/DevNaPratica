/* Database: SqlServer. Generation date: 2019-06-30 16:05:58:877 */
/* Entity Professor */
create table professor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_contratacao DATE NOT NULL /* dataContratacao */,
	salario FLOAT(32) NOT NULL
);



/* Entity Aluno */
create table aluno (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_inicio DATE NOT NULL /* dataInicio */
);



/* Entity Turma */
create table turma (
	id UNIQUEIDENTIFIER NOT NULL,
	desc_turma VARCHAR(255) NOT NULL /* descTurma */,
	horario TIME NOT NULL,
	valor_mensalidade FLOAT(32) NOT NULL /* valorMensalidade */,
	limite_alunos NUMERIC(19) NOT NULL /* limiteAlunos */
);



/* Entity Avaliacao */
create table avaliacao (
	id UNIQUEIDENTIFIER NOT NULL,
	desc_nota VARCHAR(255) NOT NULL /* descNota */,
	nota FLOAT(32) NOT NULL,
	data_avaliacao DATE NOT NULL /* dataAvaliacao */
);



/* Join Tables */
/* master: Professor as professor, detail: Turma as turma */
create table professor_turmas (
	professor_id UNIQUEIDENTIFIER NOT NULL,
	turmas_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Aluno as aluno, detail: Avaliacao as avaliacao */
create table aluno_notas (
	aluno_id UNIQUEIDENTIFIER NOT NULL,
	notas_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id UNIQUEIDENTIFIER NOT NULL,
	alunos_id UNIQUEIDENTIFIER NOT NULL
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
alter table professor_turmas add constraint fkhdfkgtd4ozvlioyyaj84cuvayz46 foreign key (professor_id) references professor (id);
alter table professor_turmas add constraint fkxlrc18myxk7sstc2stlny58emwpf foreign key (turmas_id) references turma (id);
alter table aluno_notas add constraint fk18hk7qutq81mhjjsajcl4ftro4fe foreign key (aluno_id) references aluno (id);
alter table aluno_notas add constraint fknzecldzdeyll8feettvoviijy3eb foreign key (notas_id) references avaliacao (id);
alter table turma_alunos add constraint fkitxffqiucde0rpcsdu8bp9jq90qy foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkzz5ctqktgoqfk8bag9sebhq1izsz foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
