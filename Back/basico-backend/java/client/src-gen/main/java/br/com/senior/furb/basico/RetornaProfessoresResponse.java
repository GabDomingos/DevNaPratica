/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RetornaProfessoresOutput;

/**
 * Response method for retornaProfessores
 */
@CommandDescription(name="retornaProfessoresResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retornaProfessoresResponse")
public interface RetornaProfessoresResponse extends MessageHandler {

	void retornaProfessoresResponse(RetornaProfessoresOutput response);
	
	void retornaProfessoresResponseError(ErrorPayload error);

}
