/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Aluno;

/**
 * Response method for updateAluno
 */
@CommandDescription(name="updateAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAlunoResponse")
public interface UpdateAlunoResponse extends MessageHandler {

	void updateAlunoResponse(Aluno response);
	
	void updateAlunoResponseError(ErrorPayload error);

}
