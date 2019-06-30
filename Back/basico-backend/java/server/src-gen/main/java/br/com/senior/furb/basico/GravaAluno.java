/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Grava Aluno
 */
@CommandDescription(name="gravaAluno", kind=CommandKind.Action, requestPrimitive="gravaAluno", responsePrimitive="gravaAlunoResponse")
public interface GravaAluno extends MessageHandler {
    
    public GravaAlunoOutput gravaAluno(GravaAlunoInput request);
    
}
