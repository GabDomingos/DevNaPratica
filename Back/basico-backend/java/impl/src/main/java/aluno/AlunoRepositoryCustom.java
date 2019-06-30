package aluno;

import java.util.List;

import br.com.senior.furb.basico.AlunoEntity;

public interface AlunoRepositoryCustom {
	
	List<AlunoEntity> consultaNotaPorAluno(String id);
	boolean adicionaAluno(String nome);
	boolean AlteraAluno(String id);
	boolean RemoveAluno(String id);
}
