package professor;

import java.util.List;
import java.util.UUID;

import aluno.AlunoRepositoryCustom;
import br.com.senior.furb.basico.AlunoEntity;
import br.com.senior.furb.basico.ProfessorEntity;
import core.RepositoryBaseJpa;

public interface ProfessorRepositoryCustom {
	
	ProfessorEntity consultarProfessorPorTurma(String idProfessor);
	boolean adicionaProfessor(String nome);
	boolean AlteraProfessor(String id);
	boolean RemoveProfessor(String id);
}
