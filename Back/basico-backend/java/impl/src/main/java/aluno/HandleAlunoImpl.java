package aluno;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.Aluno;
import br.com.senior.furb.basico.AlunoDTOConverter;
import br.com.senior.furb.basico.AlunoEntity;
import br.com.senior.furb.basico.GravaAluno;
import br.com.senior.furb.basico.GravaAlunoInput;
import br.com.senior.furb.basico.GravaAlunoOutput;
import br.com.senior.furb.basico.RetornaAlunos;
import br.com.senior.furb.basico.RetornaAlunosInput;
import br.com.senior.furb.basico.RetornaAlunosOutput;
import br.com.senior.furb.basico.RetornaProfessores;
import br.com.senior.furb.basico.RetornaProfessoresInput;
import br.com.senior.furb.basico.RetornaProfessoresOutput;

public class HandleAlunoImpl implements RetornaAlunos, GravaAluno{
	
	@Inject
	AlunoDTOConverter dtoConverter;	
	
	@Autowired
	AlunoRepositoryCustom alunoRepositoryCustom;

	@Override
	public RetornaAlunosOutput retornaAlunos(RetornaAlunosInput request) {
		RetornaAlunosOutput retornoAluno = new RetornaAlunosOutput();
		
		List<AlunoEntity> alunosEntity = alunoRepositoryCustom.consultaNotaPorAluno(request.idAluno);		
		List<Aluno> alunos = new ArrayList<>();		
		
		for(int i = 0; i < alunosEntity.size() -1; i ++) {
			alunos.add(dtoConverter.toDTO(alunosEntity.get(i), Aluno.class));
		}	
		
		retornoAluno.alunos = alunos;		
		return retornoAluno;
	}

	@Override
	public GravaAlunoOutput gravaAluno(GravaAlunoInput request) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
