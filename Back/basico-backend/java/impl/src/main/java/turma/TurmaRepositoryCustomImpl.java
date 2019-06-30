package turma;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.TurmaEntity;
import br.com.senior.furb.basico.QTurmaEntity;
import br.com.senior.furb.basico.TurmaBaseRepository;
import br.com.senior.furb.basico.TurmaDTOConverter;
import br.com.senior.furb.basico.QTurmaEntity;
import br.com.senior.furb.basico.TurmaEntity;
import core.RepositoryBaseJpa;

public class TurmaRepositoryCustomImpl extends RepositoryBaseJpa implements TurmaRepositoryCustom{
	
	@Inject
	TurmaDTOConverter dtoConverter;	
	
	private TurmaBaseRepository turmaRespository;

	@Override
	public Long quantidadeTurmas(String idTurma) {
		UUID uuidToFind = UUID.fromString(idTurma);
		QTurmaEntity turma = QTurmaEntity.turmaEntity;
		
		JPAQuery<TurmaEntity> queryTurma = select(turma).from(turma).where(turma.id.eq(uuidToFind)); 
		
		Long turmaDado = queryTurma.fetchCount();
		
		return turmaDado;
	}

	@Override
	public List<TurmaEntity> consultaNotaPorTurma(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QTurmaEntity turma = QTurmaEntity.turmaEntity;
		
		JPAQuery<TurmaEntity> queryTurma = select(turma).from(turma).where(turma.id.eq(uuidToFind)); 
		
		List<TurmaEntity> turmaDado = queryTurma.fetch();
		
		return turmaDado;
	}

	@Override
	public boolean adicionaTurma(String nome) {
		QTurmaEntity turmaAdd = QTurmaEntity.turmaEntity;
		long query = select(turmaAdd).from(turmaAdd).where(turmaAdd.descTurma.eq(nome)).fetchCount();
		
		JPAQuery<TurmaEntity> queryTurma = select(turmaAdd).from(turmaAdd).where(turmaAdd.descTurma.eq(nome)); 		
		TurmaEntity turmaDado = queryTurma.fetchFirst();
		
		if(query<=0) {			
			turmaRespository.save(turmaDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean AlteraTurma(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QTurmaEntity turma = QTurmaEntity.turmaEntity;
		long query =  select(turma).from(turma).where(turma.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<TurmaEntity> queryTurma = select(turma).from(turma).where(turma.id.eq(uuidToFind)); 		
		TurmaEntity turmaDado = queryTurma.fetchFirst();
		
		if(query>0) {	
			turmaRespository.delete(turmaDado);
			turmaRespository.save(turmaDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean RemoveTurma(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QTurmaEntity turma = QTurmaEntity.turmaEntity;
		long query =  select(turma).from(turma).where(turma.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<TurmaEntity> queryTurma = select(turma).from(turma).where(turma.id.eq(uuidToFind)); 		
		TurmaEntity turmaDado = queryTurma.fetchFirst();
		
		if(query>0) {	
			turmaRespository.delete(turmaDado);
			return true;
		}
		
		return false;
	}	

}
