/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Avaliacao;

/**
 * Response method for createAvaliacao
 */
@CommandDescription(name="createAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createAvaliacaoResponse")
public interface CreateAvaliacaoResponse extends MessageHandler {

	void createAvaliacaoResponse(Avaliacao response);
	
	void createAvaliacaoResponseError(ErrorPayload error);

}
