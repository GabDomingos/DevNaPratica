package avaliacao;

import java.util.List;

import br.com.senior.furb.basico.AvaliacaoEntity;


public interface AvaliacaoRepositoryCustom {
	
	boolean adicionaAvaliacao(String id);
	boolean AlteraAvaliacao(String id);
	boolean RemoveAvaliacao(String id);
}
