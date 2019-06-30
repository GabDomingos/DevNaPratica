/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Grava Professor
 */
@CommandDescription(name="gravaProfessor", kind=CommandKind.Action, requestPrimitive="gravaProfessor", responsePrimitive="gravaProfessorResponse")
public interface GravaProfessor extends MessageHandler {
    
    public GravaProfessorOutput gravaProfessor(GravaProfessorInput request);
    
}
