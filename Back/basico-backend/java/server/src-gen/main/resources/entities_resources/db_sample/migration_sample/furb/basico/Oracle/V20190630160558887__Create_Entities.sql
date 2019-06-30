/* Database: Oracle. Generation date: 2019-06-30 16:05:58:887 */
/* Entity Professor */
create table professor (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_contratacao DATE NOT NULL /* dataContratacao */,
	salario NUMBER(19,4) NOT NULL
);



/* Entity Aluno */
create table aluno (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	data_inicio DATE NOT NULL /* dataInicio */
);



/* Entity Turma */
create table turma (
	id RAW(16) NOT NULL,
	desc_turma VARCHAR(255) NOT NULL /* descTurma */,
	horario DATE NOT NULL,
	valor_mensalidade NUMBER(19,4) NOT NULL /* valorMensalidade */,
	limite_alunos NUMBER(19) NOT NULL /* limiteAlunos */
);



/* Entity Avaliacao */
create table avaliacao (
	id RAW(16) NOT NULL,
	desc_nota VARCHAR(255) NOT NULL /* descNota */,
	nota NUMBER(19,4) NOT NULL,
	data_avaliacao DATE NOT NULL /* dataAvaliacao */
);



/* Join Tables */
/* master: Professor as professor, detail: Turma as turma */
create table professor_turmas (
	professor_id RAW(16) NOT NULL,
	turmas_id RAW(16) NOT NULL
);

/* master: Aluno as aluno, detail: Avaliacao as avaliacao */
create table aluno_notas (
	aluno_id RAW(16) NOT NULL,
	notas_id RAW(16) NOT NULL
);

/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id RAW(16) NOT NULL,
	alunos_id RAW(16) NOT NULL
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
alter table professor_turmas add constraint fkvvujyakdgfetlv1dno0lfacdagzd foreign key (professor_id) references professor (id);
alter table professor_turmas add constraint fk3lz3ugl2gp6zznp9r2wfpgi6hezr foreign key (turmas_id) references turma (id);
alter table aluno_notas add constraint fkxq8rrhcvzxj3159pkbza3hld9twm foreign key (aluno_id) references aluno (id);
alter table aluno_notas add constraint fkjfsonzuat49p8nxt0asnmcgaehwe foreign key (notas_id) references avaliacao (id);
alter table turma_alunos add constraint fkua4n6vcgm3fbcsndzvmy1r9gzgac foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkfuzekiwarxdinfdol8qaucxxapib foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
