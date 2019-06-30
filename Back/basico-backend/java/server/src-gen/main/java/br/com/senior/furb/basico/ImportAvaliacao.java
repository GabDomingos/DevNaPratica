/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importAvaliacao", kind=CommandKind.Action, requestPrimitive="importAvaliacao", responsePrimitive="importAvaliacaoResponse")
public interface ImportAvaliacao extends MessageHandler {
    
    public ImportAvaliacaoOutput importAvaliacao(ImportAvaliacaoInput request);
    
}
