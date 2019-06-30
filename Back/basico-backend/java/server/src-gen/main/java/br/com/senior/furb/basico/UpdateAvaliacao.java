/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Avaliacao entity.
 */
@CommandDescription(name="updateAvaliacao", kind=CommandKind.Update, requestPrimitive="updateAvaliacao", responsePrimitive="updateAvaliacaoResponse")
public interface UpdateAvaliacao extends MessageHandler {
    
    public Avaliacao updateAvaliacao(Avaliacao toUpdate);
    
}
