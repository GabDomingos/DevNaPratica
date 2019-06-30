/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Avaliacao entity.
 */
@CommandDescription(name="createAvaliacao", kind=CommandKind.Create, requestPrimitive="createAvaliacao", responsePrimitive="createAvaliacaoResponse")
public interface CreateAvaliacao extends MessageHandler {
    
    public Avaliacao createAvaliacao(Avaliacao toCreate);
    
}
