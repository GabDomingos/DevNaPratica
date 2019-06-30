/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportAvaliacao", kind=CommandKind.Query, requestPrimitive="exportAvaliacao", responsePrimitive="exportAvaliacaoResponse")
public interface ExportAvaliacao extends MessageHandler {
    
    public ExportAvaliacaoOutput exportAvaliacao(ExportAvaliacaoInput request);
    
}
