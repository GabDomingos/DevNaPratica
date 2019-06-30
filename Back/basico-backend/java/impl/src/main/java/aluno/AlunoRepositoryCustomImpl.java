package aluno;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.Aluno;
import br.com.senior.furb.basico.AlunoBaseRepository;
import br.com.senior.furb.basico.AlunoDTOConverter;
import br.com.senior.furb.basico.AlunoEntity;
import br.com.senior.furb.basico.QAlunoEntity;
import core.RepositoryBaseJpa;

public class AlunoRepositoryCustomImpl extends RepositoryBaseJpa implements AlunoRepositoryCustom{	
	
	@Inject
	AlunoDTOConverter dtoConverter;	
	
	private AlunoBaseRepository alunoRespository;

	@Override
	public List<AlunoEntity> consultaNotaPorAluno(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAlunoEntity aluno = QAlunoEntity.alunoEntity;
		
		JPAQuery<AlunoEntity> queryAluno = select(aluno).from(aluno).where(aluno.id.eq(uuidToFind)); 
		
		List<AlunoEntity> alunoDado = queryAluno.fetch();
		
		return alunoDado;
	}

	@Override
	public boolean adicionaAluno(String nome) {
		QAlunoEntity alunoAdd = QAlunoEntity.alunoEntity;
		long query = select(alunoAdd).from(alunoAdd).where(alunoAdd.nome.eq(nome)).fetchCount();
		
		JPAQuery<AlunoEntity> queryAluno = select(alunoAdd).from(alunoAdd).where(alunoAdd.nome.eq(nome)); 		
		AlunoEntity alunoDado = queryAluno.fetchFirst();
		
		if(query<=0) {			
			alunoRespository.save(alunoDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean AlteraAluno(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAlunoEntity aluno = QAlunoEntity.alunoEntity;
		long query =  select(aluno).from(aluno).where(aluno.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<AlunoEntity> queryAluno = select(aluno).from(aluno).where(aluno.id.eq(uuidToFind)); 		
		AlunoEntity alunoDado = queryAluno.fetchFirst();
		
		if(query>0) {	
			alunoRespository.delete(alunoDado);
			alunoRespository.save(alunoDado);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean RemoveAluno(String id) {
		UUID uuidToFind = UUID.fromString(id);
		QAlunoEntity aluno = QAlunoEntity.alunoEntity;
		long query =  select(aluno).from(aluno).where(aluno.id.eq(uuidToFind)).fetchCount(); 
		
		JPAQuery<AlunoEntity> queryAluno = select(aluno).from(aluno).where(aluno.id.eq(uuidToFind)); 		
		AlunoEntity alunoDado = queryAluno.fetchFirst();
		
		if(query>0) {	
			alunoRespository.delete(alunoDado);
			return true;
		}
		
		return false;
	}	
}
