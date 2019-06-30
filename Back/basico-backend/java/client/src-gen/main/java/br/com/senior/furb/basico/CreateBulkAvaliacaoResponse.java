/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkAvaliacaoOutput;

/**
 * Response method for createBulkAvaliacao
 */
@CommandDescription(name="createBulkAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkAvaliacaoResponse")
public interface CreateBulkAvaliacaoResponse extends MessageHandler {

	void createBulkAvaliacaoResponse(CreateBulkAvaliacaoOutput response);
	
	void createBulkAvaliacaoResponseError(ErrorPayload error);

}
