/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import java.util.concurrent.CompletableFuture;
import br.com.senior.furb.basico.HelloWorldInput;
import br.com.senior.furb.basico.HelloWorldOutput;
import br.com.senior.furb.basico.RetornaMediaInput;
import br.com.senior.furb.basico.RetornaMediaOutput;
import br.com.senior.furb.basico.RetornaAlunosInput;
import br.com.senior.furb.basico.RetornaAlunosOutput;
import br.com.senior.furb.basico.RetornaProfessoresInput;
import br.com.senior.furb.basico.RetornaProfessoresOutput;
import br.com.senior.furb.basico.GravaProfessorInput;
import br.com.senior.furb.basico.GravaProfessorOutput;
import br.com.senior.furb.basico.GravaAlunoInput;
import br.com.senior.furb.basico.GravaAlunoOutput;
import br.com.senior.furb.basico.GravaTurmaInput;
import br.com.senior.furb.basico.GravaTurmaOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.ImportProfessorInput;
import br.com.senior.furb.basico.ImportProfessorOutput;
import br.com.senior.furb.basico.ExportProfessorInput;
import br.com.senior.furb.basico.ExportProfessorOutput;
import br.com.senior.furb.basico.ImportAlunoInput;
import br.com.senior.furb.basico.ImportAlunoOutput;
import br.com.senior.furb.basico.ExportAlunoInput;
import br.com.senior.furb.basico.ExportAlunoOutput;
import br.com.senior.furb.basico.ImportTurmaInput;
import br.com.senior.furb.basico.ImportTurmaOutput;
import br.com.senior.furb.basico.ExportTurmaInput;
import br.com.senior.furb.basico.ExportTurmaOutput;
import br.com.senior.furb.basico.ImportAvaliacaoInput;
import br.com.senior.furb.basico.ImportAvaliacaoOutput;
import br.com.senior.furb.basico.ExportAvaliacaoInput;
import br.com.senior.furb.basico.ExportAvaliacaoOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Professor;
import br.com.senior.furb.basico.CreateBulkProfessorInput;
import br.com.senior.furb.basico.CreateBulkProfessorOutput;
import br.com.senior.furb.basico.Aluno;
import br.com.senior.furb.basico.CreateBulkAlunoInput;
import br.com.senior.furb.basico.CreateBulkAlunoOutput;
import br.com.senior.furb.basico.Turma;
import br.com.senior.furb.basico.CreateBulkTurmaInput;
import br.com.senior.furb.basico.CreateBulkTurmaOutput;
import br.com.senior.furb.basico.Avaliacao;
import br.com.senior.furb.basico.CreateBulkAvaliacaoInput;
import br.com.senior.furb.basico.CreateBulkAvaliacaoOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportProfessorEventPayload;
import br.com.senior.furb.basico.ExportProfessorEventPayload;
import br.com.senior.furb.basico.ImportAlunoEventPayload;
import br.com.senior.furb.basico.ExportAlunoEventPayload;
import br.com.senior.furb.basico.ImportTurmaEventPayload;
import br.com.senior.furb.basico.ExportTurmaEventPayload;
import br.com.senior.furb.basico.ImportAvaliacaoEventPayload;
import br.com.senior.furb.basico.ExportAvaliacaoEventPayload;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	 * Chamada síncrona para o método retornaMedia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RetornaMediaOutput retornaMedia(RetornaMediaInput input, long timeout) {
		br.com.senior.furb.basico.impl.RetornaMediaImpl impl = new br.com.senior.furb.basico.impl.RetornaMediaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaMedia(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retornaMedia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void retornaMedia(RetornaMediaInput input) {
		br.com.senior.furb.basico.impl.RetornaMediaImpl impl = new br.com.senior.furb.basico.impl.RetornaMediaImpl(messengerSupplier, userId, messageSupplier);
		impl.retornaMedia(input);
	}
	
	/**
	 * Chamada assíncrona para o método retornaMedia
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<RetornaMediaOutput> retornaMediaRequest(RetornaMediaInput input) {
		br.com.senior.furb.basico.impl.RetornaMediaImpl impl = new br.com.senior.furb.basico.impl.RetornaMediaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaMediaRequest(input);
	}
	/**
	 * Chamada síncrona para o método retornaAlunos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RetornaAlunosOutput retornaAlunos(RetornaAlunosInput input, long timeout) {
		br.com.senior.furb.basico.impl.RetornaAlunosImpl impl = new br.com.senior.furb.basico.impl.RetornaAlunosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaAlunos(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retornaAlunos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void retornaAlunos(RetornaAlunosInput input) {
		br.com.senior.furb.basico.impl.RetornaAlunosImpl impl = new br.com.senior.furb.basico.impl.RetornaAlunosImpl(messengerSupplier, userId, messageSupplier);
		impl.retornaAlunos(input);
	}
	
	/**
	 * Chamada assíncrona para o método retornaAlunos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<RetornaAlunosOutput> retornaAlunosRequest(RetornaAlunosInput input) {
		br.com.senior.furb.basico.impl.RetornaAlunosImpl impl = new br.com.senior.furb.basico.impl.RetornaAlunosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaAlunosRequest(input);
	}
	/**
	 * Chamada síncrona para o método retornaProfessores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RetornaProfessoresOutput retornaProfessores(RetornaProfessoresInput input, long timeout) {
		br.com.senior.furb.basico.impl.RetornaProfessoresImpl impl = new br.com.senior.furb.basico.impl.RetornaProfessoresImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaProfessores(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retornaProfessores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void retornaProfessores(RetornaProfessoresInput input) {
		br.com.senior.furb.basico.impl.RetornaProfessoresImpl impl = new br.com.senior.furb.basico.impl.RetornaProfessoresImpl(messengerSupplier, userId, messageSupplier);
		impl.retornaProfessores(input);
	}
	
	/**
	 * Chamada assíncrona para o método retornaProfessores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<RetornaProfessoresOutput> retornaProfessoresRequest(RetornaProfessoresInput input) {
		br.com.senior.furb.basico.impl.RetornaProfessoresImpl impl = new br.com.senior.furb.basico.impl.RetornaProfessoresImpl(messengerSupplier, userId, messageSupplier);
		return impl.retornaProfessoresRequest(input);
	}
	/**
	 * Chamada síncrona para o método gravaProfessor
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Professor
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GravaProfessorOutput gravaProfessor(GravaProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.GravaProfessorImpl impl = new br.com.senior.furb.basico.impl.GravaProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método gravaProfessor
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Professor
	 */
	@Override
	public void gravaProfessor(GravaProfessorInput input) {
		br.com.senior.furb.basico.impl.GravaProfessorImpl impl = new br.com.senior.furb.basico.impl.GravaProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.gravaProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método gravaProfessor
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Professor
	 */
	@Override
	public CompletableFuture<GravaProfessorOutput> gravaProfessorRequest(GravaProfessorInput input) {
		br.com.senior.furb.basico.impl.GravaProfessorImpl impl = new br.com.senior.furb.basico.impl.GravaProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método gravaAluno
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Aluno
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GravaAlunoOutput gravaAluno(GravaAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GravaAlunoImpl impl = new br.com.senior.furb.basico.impl.GravaAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método gravaAluno
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Aluno
	 */
	@Override
	public void gravaAluno(GravaAlunoInput input) {
		br.com.senior.furb.basico.impl.GravaAlunoImpl impl = new br.com.senior.furb.basico.impl.GravaAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.gravaAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método gravaAluno
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Aluno
	 */
	@Override
	public CompletableFuture<GravaAlunoOutput> gravaAlunoRequest(GravaAlunoInput input) {
		br.com.senior.furb.basico.impl.GravaAlunoImpl impl = new br.com.senior.furb.basico.impl.GravaAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método gravaTurma
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Turma
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GravaTurmaOutput gravaTurma(GravaTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.GravaTurmaImpl impl = new br.com.senior.furb.basico.impl.GravaTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método gravaTurma
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Turma
	 */
	@Override
	public void gravaTurma(GravaTurmaInput input) {
		br.com.senior.furb.basico.impl.GravaTurmaImpl impl = new br.com.senior.furb.basico.impl.GravaTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.gravaTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método gravaTurma
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava Turma
	 */
	@Override
	public CompletableFuture<GravaTurmaOutput> gravaTurmaRequest(GravaTurmaInput input) {
		br.com.senior.furb.basico.impl.GravaTurmaImpl impl = new br.com.senior.furb.basico.impl.GravaTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravaTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importProfessor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportProfessorOutput importProfessor(ImportProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public void importProfessor(ImportProfessorInput input) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.importProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método importProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportProfessorOutput> importProfessorRequest(ImportProfessorInput input) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportProfessorOutput exportProfessor(ExportProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportProfessor(ExportProfessorInput input) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.exportProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportProfessorOutput> exportProfessorRequest(ExportProfessorInput input) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método importAluno
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAlunoOutput importAluno(ImportAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public void importAluno(ImportAlunoInput input) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.importAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportAlunoOutput> importAlunoRequest(ImportAlunoInput input) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportAluno
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAlunoOutput exportAluno(ExportAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportAluno(ExportAlunoInput input) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportAlunoOutput> exportAlunoRequest(ExportAlunoInput input) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importTurma
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportTurmaOutput importTurma(ImportTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public void importTurma(ImportTurmaInput input) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.importTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método importTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportTurmaOutput> importTurmaRequest(ImportTurmaInput input) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportTurma
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportTurmaOutput exportTurma(ExportTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportTurma(ExportTurmaInput input) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.exportTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportTurmaOutput> exportTurmaRequest(ExportTurmaInput input) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método importAvaliacao
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAvaliacaoOutput importAvaliacao(ImportAvaliacaoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ImportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAvaliacao
	 * This is a public operation
	 * 
	 */
	@Override
	public void importAvaliacao(ImportAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.ImportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ImportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.importAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAvaliacao
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportAvaliacaoOutput> importAvaliacaoRequest(ImportAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.ImportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ImportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportAvaliacao
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAvaliacaoOutput exportAvaliacao(ExportAvaliacaoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ExportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAvaliacao
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportAvaliacao(ExportAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.ExportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ExportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAvaliacao
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportAvaliacaoOutput> exportAvaliacaoRequest(ExportAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.ExportAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ExportAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor.PagedResults listProfessor(Professor.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 */
	@Override
	public void listProfessor(Professor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.listProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor.PagedResults> listProfessorRequest(Professor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno.PagedResults listAluno(Aluno.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 */
	@Override
	public void listAluno(Aluno.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno.PagedResults> listAlunoRequest(Aluno.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma.PagedResults listTurma(Turma.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 */
	@Override
	public void listTurma(Turma.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.listTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma.PagedResults> listTurmaRequest(Turma.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método listAvaliacao
	 * This is a public operation
	 * The 'list' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao.PagedResults listAvaliacao(Avaliacao.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ListAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAvaliacao
	 * This is a public operation
	 * The 'list' request primitive for the Avaliacao entity.
	 */
	@Override
	public void listAvaliacao(Avaliacao.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ListAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAvaliacao
	 * This is a public operation
	 * The 'list' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao.PagedResults> listAvaliacaoRequest(Avaliacao.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.ListAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	 * Chamada síncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor createProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 */
	@Override
	public void createProfessor(Professor input) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> createProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkProfessorOutput createBulkProfessor(CreateBulkProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 */
	@Override
	public void createBulkProfessor(CreateBulkProfessorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<CreateBulkProfessorOutput> createBulkProfessorRequest(CreateBulkProfessorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor createMergeProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 */
	@Override
	public void createMergeProfessor(Professor input) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> createMergeProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor retrieveProfessor(Professor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 */
	@Override
	public void retrieveProfessor(Professor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> retrieveProfessorRequest(Professor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor updateProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 */
	@Override
	public void updateProfessor(Professor input) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> updateProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor updateMergeProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 */
	@Override
	public void updateMergeProfessor(Professor input) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> updateMergeProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteProfessor
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteProfessor(Professor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteProfessorImpl impl = new br.com.senior.furb.basico.impl.DeleteProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteProfessor
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 */
	@Override
	public void deleteProfessor(Professor.Id input) {
		br.com.senior.furb.basico.impl.DeleteProfessorImpl impl = new br.com.senior.furb.basico.impl.DeleteProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProfessor(input);
	}
	
	/**
	 * Chamada síncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno createAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 */
	@Override
	public void createAluno(Aluno input) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> createAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAlunoOutput createBulkAluno(CreateBulkAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 */
	@Override
	public void createBulkAluno(CreateBulkAlunoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAlunoOutput> createBulkAlunoRequest(CreateBulkAlunoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno createMergeAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 */
	@Override
	public void createMergeAluno(Aluno input) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> createMergeAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno retrieveAluno(Aluno.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 */
	@Override
	public void retrieveAluno(Aluno.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> retrieveAlunoRequest(Aluno.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno updateAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 */
	@Override
	public void updateAluno(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> updateAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno updateMergeAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 */
	@Override
	public void updateMergeAluno(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> updateMergeAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteAluno
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAluno(Aluno.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteAlunoImpl impl = new br.com.senior.furb.basico.impl.DeleteAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAluno
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 */
	@Override
	public void deleteAluno(Aluno.Id input) {
		br.com.senior.furb.basico.impl.DeleteAlunoImpl impl = new br.com.senior.furb.basico.impl.DeleteAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAluno(input);
	}
	
	/**
	 * Chamada síncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma createTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 */
	@Override
	public void createTurma(Turma input) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> createTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkTurmaOutput createBulkTurma(CreateBulkTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 */
	@Override
	public void createBulkTurma(CreateBulkTurmaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<CreateBulkTurmaOutput> createBulkTurmaRequest(CreateBulkTurmaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma createMergeTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 */
	@Override
	public void createMergeTurma(Turma input) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> createMergeTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma retrieveTurma(Turma.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 */
	@Override
	public void retrieveTurma(Turma.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> retrieveTurmaRequest(Turma.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma updateTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 */
	@Override
	public void updateTurma(Turma input) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> updateTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma updateMergeTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 */
	@Override
	public void updateMergeTurma(Turma input) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> updateMergeTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteTurma
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteTurma(Turma.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteTurmaImpl impl = new br.com.senior.furb.basico.impl.DeleteTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteTurma
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 */
	@Override
	public void deleteTurma(Turma.Id input) {
		br.com.senior.furb.basico.impl.DeleteTurmaImpl impl = new br.com.senior.furb.basico.impl.DeleteTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTurma(input);
	}
	
	/**
	 * Chamada síncrona para o método createAvaliacao
	 * This is a public operation
	 * The 'create' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao createAvaliacao(Avaliacao input, long timeout) {
		br.com.senior.furb.basico.impl.CreateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAvaliacao
	 * This is a public operation
	 * The 'create' request primitive for the Avaliacao entity.
	 */
	@Override
	public void createAvaliacao(Avaliacao input) {
		br.com.senior.furb.basico.impl.CreateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAvaliacao
	 * This is a public operation
	 * The 'create' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao> createAvaliacaoRequest(Avaliacao input) {
		br.com.senior.furb.basico.impl.CreateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkAvaliacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAvaliacaoOutput createBulkAvaliacao(CreateBulkAvaliacaoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAvaliacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Avaliacao entity.
	 */
	@Override
	public void createBulkAvaliacao(CreateBulkAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAvaliacao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAvaliacaoOutput> createBulkAvaliacaoRequest(CreateBulkAvaliacaoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeAvaliacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao createMergeAvaliacao(Avaliacao input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAvaliacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Avaliacao entity.
	 */
	@Override
	public void createMergeAvaliacao(Avaliacao input) {
		br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAvaliacao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao> createMergeAvaliacaoRequest(Avaliacao input) {
		br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveAvaliacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao retrieveAvaliacao(Avaliacao.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAvaliacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Avaliacao entity.
	 */
	@Override
	public void retrieveAvaliacao(Avaliacao.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAvaliacao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao> retrieveAvaliacaoRequest(Avaliacao.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateAvaliacao
	 * This is a public operation
	 * The 'update' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao updateAvaliacao(Avaliacao input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAvaliacao
	 * This is a public operation
	 * The 'update' request primitive for the Avaliacao entity.
	 */
	@Override
	public void updateAvaliacao(Avaliacao input) {
		br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAvaliacao
	 * This is a public operation
	 * The 'update' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao> updateAvaliacaoRequest(Avaliacao input) {
		br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeAvaliacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Avaliacao updateMergeAvaliacao(Avaliacao input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAvaliacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Avaliacao entity.
	 */
	@Override
	public void updateMergeAvaliacao(Avaliacao input) {
		br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAvaliacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAvaliacao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Avaliacao entity.
	 */
	@Override
	public CompletableFuture<Avaliacao> updateMergeAvaliacaoRequest(Avaliacao input) {
		br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAvaliacaoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteAvaliacao
	 * This is a public operation
	 * The 'delete' request primitive for the Avaliacao entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAvaliacao(Avaliacao.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.DeleteAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAvaliacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAvaliacao
	 * This is a public operation
	 * The 'delete' request primitive for the Avaliacao entity.
	 */
	@Override
	public void deleteAvaliacao(Avaliacao.Id input) {
		br.com.senior.furb.basico.impl.DeleteAvaliacaoImpl impl = new br.com.senior.furb.basico.impl.DeleteAvaliacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAvaliacao(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportProfessorEvent
	* This is a public operation
	*/
	public void publishImportProfessorEvent( ImportProfessorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_PROFESSOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportProfessorEvent
	* This is a public operation
	*/
	public void publishExportProfessorEvent( ExportProfessorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_PROFESSOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportAlunoEvent
	* This is a public operation
	*/
	public void publishImportAlunoEvent( ImportAlunoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_ALUNO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportAlunoEvent
	* This is a public operation
	*/
	public void publishExportAlunoEvent( ExportAlunoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_ALUNO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportTurmaEvent
	* This is a public operation
	*/
	public void publishImportTurmaEvent( ImportTurmaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_TURMA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportTurmaEvent
	* This is a public operation
	*/
	public void publishExportTurmaEvent( ExportTurmaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_TURMA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportAvaliacaoEvent
	* This is a public operation
	*/
	public void publishImportAvaliacaoEvent( ImportAvaliacaoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_AVALIACAO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportAvaliacaoEvent
	* This is a public operation
	*/
	public void publishExportAvaliacaoEvent( ExportAvaliacaoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_AVALIACAO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
