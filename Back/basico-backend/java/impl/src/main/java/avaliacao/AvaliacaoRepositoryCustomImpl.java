package avaliacao;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.AvaliacaoBaseRepository;
import br.com.senior.furb.basico.AvaliacaoDTOConverter;
import br.com.senior.furb.basico.AvaliacaoEntity;
import br.com.senior.furb.basico.AvaliacaoBaseRepository;
import br.com.senior.furb.basico.AvaliacaoDTOConverter;
import br.com.senior.furb.basico.AvaliacaoEntity;
import br.com.senior.furb.basico.QAvaliacaoEntity;
import core.RepositoryBaseJpa;
import avaliacao.AvaliacaoRepositoryCustom;

public class AvaliacaoRepositoryCustomImpl extends RepositoryBaseJpa implements AvaliacaoRepositoryCustom{
	
	@Inject
	AvaliacaoDTOConverter dtoConverter;	
	
	private AvaliacaoBaseRepository avaliacaoRespository;

	@Override
	public boolean adicionaAvaliacao(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAvaliacaoEntity avaliacaoAdd = QAvaliacaoEntity.avaliacaoEntity;
		long query = select(avaliacaoAdd).from(avaliacaoAdd).where(avaliacaoAdd.id.eq(uuidToFind)).fetchCount();
		
		JPAQuery<AvaliacaoEntity> queryAvaliacao = select(avaliacaoAdd).from(avaliacaoAdd).where(avaliacaoAdd.id.eq(uuidToFind)); 		
		AvaliacaoEntity avaliacaoDado = queryAvaliacao.fetchFirst();
		
		if(query<=0) {			
			avaliacaoRespository.save(avaliacaoDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean AlteraAvaliacao(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAvaliacaoEntity avaliacao = QAvaliacaoEntity.avaliacaoEntity;
		long query =  select(avaliacao).from(avaliacao).where(avaliacao.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<AvaliacaoEntity> queryAvaliacao = select(avaliacao).from(avaliacao).where(avaliacao.id.eq(uuidToFind)); 		
		AvaliacaoEntity avaliacaoDado = queryAvaliacao.fetchFirst();
		
		if(query>0) {	
			avaliacaoRespository.delete(avaliacaoDado);
			avaliacaoRespository.save(avaliacaoDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean RemoveAvaliacao(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAvaliacaoEntity avaliacao = QAvaliacaoEntity.avaliacaoEntity;
		long query =  select(avaliacao).from(avaliacao).where(avaliacao.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<AvaliacaoEntity> queryAvaliacao = select(avaliacao).from(avaliacao).where(avaliacao.id.eq(uuidToFind)); 		
		AvaliacaoEntity avaliacaoDado = queryAvaliacao.fetchFirst();
		
		if(query>0) {	
			avaliacaoRespository.delete(avaliacaoDado);
			return true;
		}
		
		return false;
	}

}
