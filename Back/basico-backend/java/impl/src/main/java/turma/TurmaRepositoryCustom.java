package turma;

import java.util.List;

import br.com.senior.furb.basico.TurmaEntity;


public interface TurmaRepositoryCustom {
	
	boolean adicionaTurma(String nome);
	boolean AlteraTurma(String id);
	boolean RemoveTurma(String id);
	Long quantidadeTurmas(String idTurma);
	List<TurmaEntity> consultaNotaPorTurma(String id);
}
