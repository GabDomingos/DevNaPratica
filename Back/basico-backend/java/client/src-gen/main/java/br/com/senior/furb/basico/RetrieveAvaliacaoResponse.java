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
 * Response method for retrieveAvaliacao
 */
@CommandDescription(name="retrieveAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveAvaliacaoResponse")
public interface RetrieveAvaliacaoResponse extends MessageHandler {

	void retrieveAvaliacaoResponse(Avaliacao response);
	
	void retrieveAvaliacaoResponseError(ErrorPayload error);

}
