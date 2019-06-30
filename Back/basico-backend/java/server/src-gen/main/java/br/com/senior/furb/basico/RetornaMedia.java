/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaMedia", kind=CommandKind.Query, requestPrimitive="retornaMedia", responsePrimitive="retornaMediaResponse")
public interface RetornaMedia extends MessageHandler {
    
    public RetornaMediaOutput retornaMedia(RetornaMediaInput request);
    
}
