/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Avaliacao entity.
 */
@CommandDescription(name="listAvaliacao", kind=CommandKind.List, requestPrimitive="listAvaliacao", responsePrimitive="listAvaliacaoResponse")
public interface ListAvaliacao extends MessageHandler {
    
    public Avaliacao.PagedResults listAvaliacao(Avaliacao.PageRequest pageRequest);
    
}
