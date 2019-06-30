/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaMediaOutput;

/**
 * Response method for retornaMedia
 */
@CommandDescription(name="retornaMediaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaMediaResponse")
public interface RetornaMediaResponse extends MessageHandler {

	void retornaMediaResponse(RetornaMediaOutput response);
	
	void retornaMediaResponseError(ErrorPayload error);

}
