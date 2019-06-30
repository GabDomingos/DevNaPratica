/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAvaliacao
 */
@CommandDescription(name="listAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAvaliacaoResponse")
public interface ListAvaliacaoResponse extends MessageHandler {

	void listAvaliacaoResponse(Avaliacao.PagedResults response);
	
	void listAvaliacaoResponseError(ErrorPayload error);

}
