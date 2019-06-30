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
 * Response method for updateMergeAvaliacao
 */
@CommandDescription(name="updateMergeAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeAvaliacaoResponse")
public interface UpdateMergeAvaliacaoResponse extends MessageHandler {

	void updateMergeAvaliacaoResponse(Avaliacao response);
	
	void updateMergeAvaliacaoResponseError(ErrorPayload error);

}
