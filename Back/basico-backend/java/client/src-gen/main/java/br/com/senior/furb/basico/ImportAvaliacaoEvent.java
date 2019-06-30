/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="furb", service="basico", event="importAvaliacaoEvent")
public interface ImportAvaliacaoEvent extends MessageHandler {
    public void importAvaliacaoEvent(ImportAvaliacaoEventPayload payload);
    
}
