/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaAlunosOutput;

/**
 * Response method for retornaAlunos
 */
@CommandDescription(name="retornaAlunosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaAlunosResponse")
public interface RetornaAlunosResponse extends MessageHandler {

	void retornaAlunosResponse(RetornaAlunosOutput response);
	
	void retornaAlunosResponseError(ErrorPayload error);

}
