/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="retornaAlunos", kind=CommandKind.Query, requestPrimitive="retornaAlunos", responsePrimitive="retornaAlunosResponse")
public interface RetornaAlunos extends MessageHandler {
    
    public RetornaAlunosOutput retornaAlunos(RetornaAlunosInput request);
    
}
