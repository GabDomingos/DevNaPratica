/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportAvaliacaoOutput;

/**
 * Response method for exportAvaliacao
 */
@CommandDescription(name="exportAvaliacaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportAvaliacaoResponse")
public interface ExportAvaliacaoResponse extends MessageHandler {

	void exportAvaliacaoResponse(ExportAvaliacaoOutput response);
	
	void exportAvaliacaoResponseError(ErrorPayload error);

}
