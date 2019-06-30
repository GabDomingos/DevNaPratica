/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Grava Turma
 */
@CommandDescription(name="gravaTurma", kind=CommandKind.Action, requestPrimitive="gravaTurma", responsePrimitive="gravaTurmaResponse")
public interface GravaTurma extends MessageHandler {
    
    public GravaTurmaOutput gravaTurma(GravaTurmaInput request);
    
}
