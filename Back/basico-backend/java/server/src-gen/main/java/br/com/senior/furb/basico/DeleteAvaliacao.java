/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Avaliacao entity.
 */
@CommandDescription(name="deleteAvaliacao", kind=CommandKind.Delete, requestPrimitive="deleteAvaliacao", responsePrimitive="deleteAvaliacaoResponse")
public interface DeleteAvaliacao extends MessageHandler {
    
    public void deleteAvaliacao(Avaliacao.Id id);
    
}
