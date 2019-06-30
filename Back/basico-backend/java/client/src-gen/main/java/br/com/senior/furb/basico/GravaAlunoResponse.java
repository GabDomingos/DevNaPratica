/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.GravaAlunoOutput;

/**
 * Response method for gravaAluno
 */
@CommandDescription(name="gravaAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="gravaAlunoResponse")
public interface GravaAlunoResponse extends MessageHandler {

	void gravaAlunoResponse(GravaAlunoOutput response);
	
	void gravaAlunoResponseError(ErrorPayload error);

}
