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
 * Response method for updateAvaliacao
 */
@CommandDescription(name="updateAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAvaliacaoResponse")
public interface UpdateAvaliacaoResponse extends MessageHandler {

	void updateAvaliacaoResponse(Avaliacao response);
	
	void updateAvaliacaoResponseError(ErrorPayload error);

}
