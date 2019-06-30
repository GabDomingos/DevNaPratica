package professor;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.Professor;
import br.com.senior.furb.basico.ProfessorDTOConverter;
import br.com.senior.furb.basico.ProfessorEntity;
import br.com.senior.furb.basico.RetornaProfessores;
import br.com.senior.furb.basico.RetornaProfessoresInput;
import br.com.senior.furb.basico.RetornaProfessoresOutput;



public class HandleProfessorImpl implements RetornaProfessores{
	
	@Inject
	ProfessorDTOConverter dtoConverter;	
	
	@Autowired
	ProfessorRepositoryCustom profRepositoryCustom;	

	@Override
	public RetornaProfessoresOutput retornaProfessores(RetornaProfessoresInput request) {
		RetornaProfessoresOutput retornoProf = new RetornaProfessoresOutput();
		
		ProfessorEntity professorEntity = profRepositoryCustom.consultarProfessorPorTurma(request.idProfessor);		
		Professor prof = dtoConverter.toDTO(professorEntity, Professor.class);			
		retornoProf.professor = prof;		
		return retornoProf;
	}
}
