/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaProfessores", kind=CommandKind.Query, requestPrimitive="retornaProfessores", responsePrimitive="retornaProfessoresResponse")
public interface RetornaProfessores extends MessageHandler {
    
    public RetornaProfessoresOutput retornaProfessores(RetornaProfessoresInput request);
    
}
