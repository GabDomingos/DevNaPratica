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
 * Response method for createMergeAvaliacao
 */
@CommandDescription(name="createMergeAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeAvaliacaoResponse")
public interface CreateMergeAvaliacaoResponse extends MessageHandler {

	void createMergeAvaliacaoResponse(Avaliacao response);
	
	void createMergeAvaliacaoResponseError(ErrorPayload error);

}
