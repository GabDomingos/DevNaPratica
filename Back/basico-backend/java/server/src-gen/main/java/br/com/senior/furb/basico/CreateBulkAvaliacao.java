/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkAvaliacao", kind = CommandKind.Create, requestPrimitive = "createBulkAvaliacao", responsePrimitive="")
public interface CreateBulkAvaliacao extends MessageHandler {
    public CreateBulkAvaliacaoOutput createBulkAvaliacao(CreateBulkAvaliacaoInput toCreate);
}
