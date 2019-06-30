package professor;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import com.querydsl.jpa.impl.JPAQuery;

import professor.ProfessorRepositoryCustom;
import br.com.senior.furb.basico.ProfessorEntity;
import br.com.senior.furb.basico.AlunoBaseRepository;
import br.com.senior.furb.basico.AlunoDTOConverter;
import br.com.senior.furb.basico.ProfessorBaseRepository;
import br.com.senior.furb.basico.ProfessorDTOConverter;
import br.com.senior.furb.basico.ProfessorEntity;
import br.com.senior.furb.basico.QProfessorEntity;
import br.com.senior.furb.basico.QProfessorEntity;
import core.RepositoryBaseJpa;

public class ProfessorRepositoryCustomImpl extends RepositoryBaseJpa implements ProfessorRepositoryCustom{
	
	@Inject
	ProfessorDTOConverter dtoConverter;	
	
	private ProfessorBaseRepository professorRespository;

	@Override
	public ProfessorEntity consultarProfessorPorTurma(String idTurma) {
		UUID uuidToFind = UUID.fromString(idTurma);
		QProfessorEntity prof = QProfessorEntity.professorEntity;
		
		JPAQuery<ProfessorEntity> queryProfessor = select(prof).from(prof).where(prof.id.eq(uuidToFind)); 
		
		ProfessorEntity professorDado = queryProfessor.fetchFirst();
		
		return professorDado;
	}

	@Override
	public boolean adicionaProfessor(String nome) {
		QProfessorEntity professorAdd = QProfessorEntity.professorEntity;
		long query = select(professorAdd).from(professorAdd).where(professorAdd.nome.eq(nome)).fetchCount();
		
		JPAQuery<ProfessorEntity> queryProfessor = select(professorAdd).from(professorAdd).where(professorAdd.nome.eq(nome)); 		
		ProfessorEntity professorDado = queryProfessor.fetchFirst();
		
		if(query<=0) {			
			professorRespository.save(professorDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean AlteraProfessor(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QProfessorEntity professor = QProfessorEntity.professorEntity;
		long query =  select(professor).from(professor).where(professor.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<ProfessorEntity> queryProfessor = select(professor).from(professor).where(professor.id.eq(uuidToFind)); 		
		ProfessorEntity professorDado = queryProfessor.fetchFirst();
		
		if(query>0) {	
			professorRespository.delete(professorDado);
			professorRespository.save(professorDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean RemoveProfessor(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QProfessorEntity professor = QProfessorEntity.professorEntity;
		long query =  select(professor).from(professor).where(professor.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<ProfessorEntity> queryProfessor = select(professor).from(professor).where(professor.id.eq(uuidToFind)); 		
		ProfessorEntity professorDado = queryProfessor.fetchFirst();
		
		if(query>0) {	
			professorRespository.delete(professorDado);
			return true;
		}
		
		return false;
	}

	
	
	
	
}
