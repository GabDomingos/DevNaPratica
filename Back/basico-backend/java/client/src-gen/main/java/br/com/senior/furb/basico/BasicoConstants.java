/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * @see RetornaMediaInput the request payload
    	 */
    	String RETORNA_MEDIA = "retornaMedia";
    	/**
    	 * The success response primitive for retornaMedia.
    	 *
    	 * @see #RETORNA_MEDIA the request primitive
    	 * @see RetornaMediaOutput the response payload
    	 */
    	String RETORNA_MEDIA_RESPONSE = "retornaMediaResponse";
    	/**
    	 * An error response primitive for retornaMedia.
    	 *
    	 * @see #RETORNA_MEDIA the request primitive
    	 */
    	String RETORNA_MEDIA_ERROR = "retornaMediaError";
    	/**
    	 * @see RetornaAlunosInput the request payload
    	 */
    	String RETORNA_ALUNOS = "retornaAlunos";
    	/**
    	 * The success response primitive for retornaAlunos.
    	 *
    	 * @see #RETORNA_ALUNOS the request primitive
    	 * @see RetornaAlunosOutput the response payload
    	 */
    	String RETORNA_ALUNOS_RESPONSE = "retornaAlunosResponse";
    	/**
    	 * An error response primitive for retornaAlunos.
    	 *
    	 * @see #RETORNA_ALUNOS the request primitive
    	 */
    	String RETORNA_ALUNOS_ERROR = "retornaAlunosError";
    	/**
    	 * @see RetornaProfessoresInput the request payload
    	 */
    	String RETORNA_PROFESSORES = "retornaProfessores";
    	/**
    	 * The success response primitive for retornaProfessores.
    	 *
    	 * @see #RETORNA_PROFESSORES the request primitive
    	 * @see RetornaProfessoresOutput the response payload
    	 */
    	String RETORNA_PROFESSORES_RESPONSE = "retornaProfessoresResponse";
    	/**
    	 * An error response primitive for retornaProfessores.
    	 *
    	 * @see #RETORNA_PROFESSORES the request primitive
    	 */
    	String RETORNA_PROFESSORES_ERROR = "retornaProfessoresError";
    	/**
    	 * Grava Professor
    	 * @see GravaProfessorInput the request payload
    	 */
    	String GRAVA_PROFESSOR = "gravaProfessor";
    	/**
    	 * The success response primitive for gravaProfessor.
    	 *
    	 * @see #GRAVA_PROFESSOR the request primitive
    	 * @see GravaProfessorOutput the response payload
    	 */
    	String GRAVA_PROFESSOR_RESPONSE = "gravaProfessorResponse";
    	/**
    	 * An error response primitive for gravaProfessor.
    	 *
    	 * @see #GRAVA_PROFESSOR the request primitive
    	 */
    	String GRAVA_PROFESSOR_ERROR = "gravaProfessorError";
    	/**
    	 * Grava Aluno
    	 * @see GravaAlunoInput the request payload
    	 */
    	String GRAVA_ALUNO = "gravaAluno";
    	/**
    	 * The success response primitive for gravaAluno.
    	 *
    	 * @see #GRAVA_ALUNO the request primitive
    	 * @see GravaAlunoOutput the response payload
    	 */
    	String GRAVA_ALUNO_RESPONSE = "gravaAlunoResponse";
    	/**
    	 * An error response primitive for gravaAluno.
    	 *
    	 * @see #GRAVA_ALUNO the request primitive
    	 */
    	String GRAVA_ALUNO_ERROR = "gravaAlunoError";
    	/**
    	 * Grava Turma
    	 * @see GravaTurmaInput the request payload
    	 */
    	String GRAVA_TURMA = "gravaTurma";
    	/**
    	 * The success response primitive for gravaTurma.
    	 *
    	 * @see #GRAVA_TURMA the request primitive
    	 * @see GravaTurmaOutput the response payload
    	 */
    	String GRAVA_TURMA_RESPONSE = "gravaTurmaResponse";
    	/**
    	 * An error response primitive for gravaTurma.
    	 *
    	 * @see #GRAVA_TURMA the request primitive
    	 */
    	String GRAVA_TURMA_ERROR = "gravaTurmaError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportProfessorInput the request payload
    	 */
    	String IMPORT_PROFESSOR = "importProfessor";
    	/**
    	 * The success response primitive for importProfessor.
    	 *
    	 * @see #IMPORT_PROFESSOR the request primitive
    	 * @see ImportProfessorOutput the response payload
    	 */
    	String IMPORT_PROFESSOR_RESPONSE = "importProfessorResponse";
    	/**
    	 * An error response primitive for importProfessor.
    	 *
    	 * @see #IMPORT_PROFESSOR the request primitive
    	 */
    	String IMPORT_PROFESSOR_ERROR = "importProfessorError";
    	/**
    	 * @see ExportProfessorInput the request payload
    	 */
    	String EXPORT_PROFESSOR = "exportProfessor";
    	/**
    	 * The success response primitive for exportProfessor.
    	 *
    	 * @see #EXPORT_PROFESSOR the request primitive
    	 * @see ExportProfessorOutput the response payload
    	 */
    	String EXPORT_PROFESSOR_RESPONSE = "exportProfessorResponse";
    	/**
    	 * An error response primitive for exportProfessor.
    	 *
    	 * @see #EXPORT_PROFESSOR the request primitive
    	 */
    	String EXPORT_PROFESSOR_ERROR = "exportProfessorError";
    	/**
    	 * @see ImportAlunoInput the request payload
    	 */
    	String IMPORT_ALUNO = "importAluno";
    	/**
    	 * The success response primitive for importAluno.
    	 *
    	 * @see #IMPORT_ALUNO the request primitive
    	 * @see ImportAlunoOutput the response payload
    	 */
    	String IMPORT_ALUNO_RESPONSE = "importAlunoResponse";
    	/**
    	 * An error response primitive for importAluno.
    	 *
    	 * @see #IMPORT_ALUNO the request primitive
    	 */
    	String IMPORT_ALUNO_ERROR = "importAlunoError";
    	/**
    	 * @see ExportAlunoInput the request payload
    	 */
    	String EXPORT_ALUNO = "exportAluno";
    	/**
    	 * The success response primitive for exportAluno.
    	 *
    	 * @see #EXPORT_ALUNO the request primitive
    	 * @see ExportAlunoOutput the response payload
    	 */
    	String EXPORT_ALUNO_RESPONSE = "exportAlunoResponse";
    	/**
    	 * An error response primitive for exportAluno.
    	 *
    	 * @see #EXPORT_ALUNO the request primitive
    	 */
    	String EXPORT_ALUNO_ERROR = "exportAlunoError";
    	/**
    	 * @see ImportTurmaInput the request payload
    	 */
    	String IMPORT_TURMA = "importTurma";
    	/**
    	 * The success response primitive for importTurma.
    	 *
    	 * @see #IMPORT_TURMA the request primitive
    	 * @see ImportTurmaOutput the response payload
    	 */
    	String IMPORT_TURMA_RESPONSE = "importTurmaResponse";
    	/**
    	 * An error response primitive for importTurma.
    	 *
    	 * @see #IMPORT_TURMA the request primitive
    	 */
    	String IMPORT_TURMA_ERROR = "importTurmaError";
    	/**
    	 * @see ExportTurmaInput the request payload
    	 */
    	String EXPORT_TURMA = "exportTurma";
    	/**
    	 * The success response primitive for exportTurma.
    	 *
    	 * @see #EXPORT_TURMA the request primitive
    	 * @see ExportTurmaOutput the response payload
    	 */
    	String EXPORT_TURMA_RESPONSE = "exportTurmaResponse";
    	/**
    	 * An error response primitive for exportTurma.
    	 *
    	 * @see #EXPORT_TURMA the request primitive
    	 */
    	String EXPORT_TURMA_ERROR = "exportTurmaError";
    	/**
    	 * @see ImportAvaliacaoInput the request payload
    	 */
    	String IMPORT_AVALIACAO = "importAvaliacao";
    	/**
    	 * The success response primitive for importAvaliacao.
    	 *
    	 * @see #IMPORT_AVALIACAO the request primitive
    	 * @see ImportAvaliacaoOutput the response payload
    	 */
    	String IMPORT_AVALIACAO_RESPONSE = "importAvaliacaoResponse";
    	/**
    	 * An error response primitive for importAvaliacao.
    	 *
    	 * @see #IMPORT_AVALIACAO the request primitive
    	 */
    	String IMPORT_AVALIACAO_ERROR = "importAvaliacaoError";
    	/**
    	 * @see ExportAvaliacaoInput the request payload
    	 */
    	String EXPORT_AVALIACAO = "exportAvaliacao";
    	/**
    	 * The success response primitive for exportAvaliacao.
    	 *
    	 * @see #EXPORT_AVALIACAO the request primitive
    	 * @see ExportAvaliacaoOutput the response payload
    	 */
    	String EXPORT_AVALIACAO_RESPONSE = "exportAvaliacaoResponse";
    	/**
    	 * An error response primitive for exportAvaliacao.
    	 *
    	 * @see #EXPORT_AVALIACAO the request primitive
    	 */
    	String EXPORT_AVALIACAO_ERROR = "exportAvaliacaoError";
    	/**
    	 * The 'list' request primitive for the Professor entity.
    	 * @see professor.pageRequest the request payload
    	 */
    	String LIST_PROFESSOR = "listProfessor";
    	/**
    	 * The success response primitive for listProfessor.
    	 *
    	 * @see #LIST_PROFESSOR the request primitive
    	 * @see Professor.PagedResults the response payload
    	 */
    	String LIST_PROFESSOR_RESPONSE = "listProfessorResponse";
    	/**
    	 * An error response primitive for listProfessor.
    	 *
    	 * @see #LIST_PROFESSOR the request primitive
    	 */
    	String LIST_PROFESSOR_ERROR = "listProfessorError";
    	/**
    	 * The 'list' request primitive for the Aluno entity.
    	 * @see aluno.pageRequest the request payload
    	 */
    	String LIST_ALUNO = "listAluno";
    	/**
    	 * The success response primitive for listAluno.
    	 *
    	 * @see #LIST_ALUNO the request primitive
    	 * @see Aluno.PagedResults the response payload
    	 */
    	String LIST_ALUNO_RESPONSE = "listAlunoResponse";
    	/**
    	 * An error response primitive for listAluno.
    	 *
    	 * @see #LIST_ALUNO the request primitive
    	 */
    	String LIST_ALUNO_ERROR = "listAlunoError";
    	/**
    	 * The 'list' request primitive for the Turma entity.
    	 * @see turma.pageRequest the request payload
    	 */
    	String LIST_TURMA = "listTurma";
    	/**
    	 * The success response primitive for listTurma.
    	 *
    	 * @see #LIST_TURMA the request primitive
    	 * @see Turma.PagedResults the response payload
    	 */
    	String LIST_TURMA_RESPONSE = "listTurmaResponse";
    	/**
    	 * An error response primitive for listTurma.
    	 *
    	 * @see #LIST_TURMA the request primitive
    	 */
    	String LIST_TURMA_ERROR = "listTurmaError";
    	/**
    	 * The 'list' request primitive for the Avaliacao entity.
    	 * @see avaliacao.pageRequest the request payload
    	 */
    	String LIST_AVALIACAO = "listAvaliacao";
    	/**
    	 * The success response primitive for listAvaliacao.
    	 *
    	 * @see #LIST_AVALIACAO the request primitive
    	 * @see Avaliacao.PagedResults the response payload
    	 */
    	String LIST_AVALIACAO_RESPONSE = "listAvaliacaoResponse";
    	/**
    	 * An error response primitive for listAvaliacao.
    	 *
    	 * @see #LIST_AVALIACAO the request primitive
    	 */
    	String LIST_AVALIACAO_ERROR = "listAvaliacaoError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String CREATE_PROFESSOR = "createProfessor";
    	/**
    	 * The success response primitive for createProfessor.
    	 *
    	 * @see #CREATE_PROFESSOR the request primitive
    	 */
    	String CREATE_PROFESSOR_RESPONSE = "createProfessorResponse";
    	/**
    	 * An error response primitive for createProfessor.
    	 *
    	 * @see #CREATE_PROFESSOR the request primitive
    	 */
    	String CREATE_PROFESSOR_ERROR = "createProfessorError";
    	/**
    	 * The 'createBulk' request primitive for the Professor entity.
    	 * @see CreateBulkProfessorInput the request payload
    	 */
    	String CREATE_BULK_PROFESSOR = "createBulkProfessor";
    	/**
    	 * The success response primitive for createBulkProfessor.
    	 *
    	 * @see #CREATE_BULK_PROFESSOR the request primitive
    	 * @see CreateBulkProfessorOutput the response payload
    	 */
    	String CREATE_BULK_PROFESSOR_RESPONSE = "createBulkProfessorResponse";
    	/**
    	 * An error response primitive for createBulkProfessor.
    	 *
    	 * @see #CREATE_BULK_PROFESSOR the request primitive
    	 */
    	String CREATE_BULK_PROFESSOR_ERROR = "createBulkProfessorError";
    	/**
    	 * The 'createMerge' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String CREATE_MERGE_PROFESSOR = "createMergeProfessor";
    	/**
    	 * The success response primitive for createMergeProfessor.
    	 *
    	 * @see #CREATE_MERGE_PROFESSOR the request primitive
    	 */
    	String CREATE_MERGE_PROFESSOR_RESPONSE = "createMergeProfessorResponse";
    	/**
    	 * An error response primitive for createMergeProfessor.
    	 *
    	 * @see #CREATE_MERGE_PROFESSOR the request primitive
    	 */
    	String CREATE_MERGE_PROFESSOR_ERROR = "createMergeProfessorError";
    	/**
    	 * The 'retrieve' request primitive for the Professor entity.
    	 * @see Professor.Id the request payload
    	 */
    	String RETRIEVE_PROFESSOR = "retrieveProfessor";
    	/**
    	 * The success response primitive for retrieveProfessor.
    	 *
    	 * @see #RETRIEVE_PROFESSOR the request primitive
    	 */
    	String RETRIEVE_PROFESSOR_RESPONSE = "retrieveProfessorResponse";
    	/**
    	 * An error response primitive for retrieveProfessor.
    	 *
    	 * @see #RETRIEVE_PROFESSOR the request primitive
    	 */
    	String RETRIEVE_PROFESSOR_ERROR = "retrieveProfessorError";
    	/**
    	 * The 'update' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String UPDATE_PROFESSOR = "updateProfessor";
    	/**
    	 * The success response primitive for updateProfessor.
    	 *
    	 * @see #UPDATE_PROFESSOR the request primitive
    	 */
    	String UPDATE_PROFESSOR_RESPONSE = "updateProfessorResponse";
    	/**
    	 * An error response primitive for updateProfessor.
    	 *
    	 * @see #UPDATE_PROFESSOR the request primitive
    	 */
    	String UPDATE_PROFESSOR_ERROR = "updateProfessorError";
    	/**
    	 * The 'updateMerge' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String UPDATE_MERGE_PROFESSOR = "updateMergeProfessor";
    	/**
    	 * The success response primitive for updateMergeProfessor.
    	 *
    	 * @see #UPDATE_MERGE_PROFESSOR the request primitive
    	 */
    	String UPDATE_MERGE_PROFESSOR_RESPONSE = "updateMergeProfessorResponse";
    	/**
    	 * An error response primitive for updateMergeProfessor.
    	 *
    	 * @see #UPDATE_MERGE_PROFESSOR the request primitive
    	 */
    	String UPDATE_MERGE_PROFESSOR_ERROR = "updateMergeProfessorError";
    	/**
    	 * The 'delete' request primitive for the Professor entity.
    	 * @see Professor.Id the request payload
    	 */
    	String DELETE_PROFESSOR = "deleteProfessor";
    	/**
    	 * The success response primitive for deleteProfessor.
    	 *
    	 * @see #DELETE_PROFESSOR the request primitive
    	 */
    	String DELETE_PROFESSOR_RESPONSE = "deleteProfessorResponse";
    	/**
    	 * An error response primitive for deleteProfessor.
    	 *
    	 * @see #DELETE_PROFESSOR the request primitive
    	 */
    	String DELETE_PROFESSOR_ERROR = "deleteProfessorError";
    	/**
    	 * The 'create' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String CREATE_ALUNO = "createAluno";
    	/**
    	 * The success response primitive for createAluno.
    	 *
    	 * @see #CREATE_ALUNO the request primitive
    	 */
    	String CREATE_ALUNO_RESPONSE = "createAlunoResponse";
    	/**
    	 * An error response primitive for createAluno.
    	 *
    	 * @see #CREATE_ALUNO the request primitive
    	 */
    	String CREATE_ALUNO_ERROR = "createAlunoError";
    	/**
    	 * The 'createBulk' request primitive for the Aluno entity.
    	 * @see CreateBulkAlunoInput the request payload
    	 */
    	String CREATE_BULK_ALUNO = "createBulkAluno";
    	/**
    	 * The success response primitive for createBulkAluno.
    	 *
    	 * @see #CREATE_BULK_ALUNO the request primitive
    	 * @see CreateBulkAlunoOutput the response payload
    	 */
    	String CREATE_BULK_ALUNO_RESPONSE = "createBulkAlunoResponse";
    	/**
    	 * An error response primitive for createBulkAluno.
    	 *
    	 * @see #CREATE_BULK_ALUNO the request primitive
    	 */
    	String CREATE_BULK_ALUNO_ERROR = "createBulkAlunoError";
    	/**
    	 * The 'createMerge' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String CREATE_MERGE_ALUNO = "createMergeAluno";
    	/**
    	 * The success response primitive for createMergeAluno.
    	 *
    	 * @see #CREATE_MERGE_ALUNO the request primitive
    	 */
    	String CREATE_MERGE_ALUNO_RESPONSE = "createMergeAlunoResponse";
    	/**
    	 * An error response primitive for createMergeAluno.
    	 *
    	 * @see #CREATE_MERGE_ALUNO the request primitive
    	 */
    	String CREATE_MERGE_ALUNO_ERROR = "createMergeAlunoError";
    	/**
    	 * The 'retrieve' request primitive for the Aluno entity.
    	 * @see Aluno.Id the request payload
    	 */
    	String RETRIEVE_ALUNO = "retrieveAluno";
    	/**
    	 * The success response primitive for retrieveAluno.
    	 *
    	 * @see #RETRIEVE_ALUNO the request primitive
    	 */
    	String RETRIEVE_ALUNO_RESPONSE = "retrieveAlunoResponse";
    	/**
    	 * An error response primitive for retrieveAluno.
    	 *
    	 * @see #RETRIEVE_ALUNO the request primitive
    	 */
    	String RETRIEVE_ALUNO_ERROR = "retrieveAlunoError";
    	/**
    	 * The 'update' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String UPDATE_ALUNO = "updateAluno";
    	/**
    	 * The success response primitive for updateAluno.
    	 *
    	 * @see #UPDATE_ALUNO the request primitive
    	 */
    	String UPDATE_ALUNO_RESPONSE = "updateAlunoResponse";
    	/**
    	 * An error response primitive for updateAluno.
    	 *
    	 * @see #UPDATE_ALUNO the request primitive
    	 */
    	String UPDATE_ALUNO_ERROR = "updateAlunoError";
    	/**
    	 * The 'updateMerge' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String UPDATE_MERGE_ALUNO = "updateMergeAluno";
    	/**
    	 * The success response primitive for updateMergeAluno.
    	 *
    	 * @see #UPDATE_MERGE_ALUNO the request primitive
    	 */
    	String UPDATE_MERGE_ALUNO_RESPONSE = "updateMergeAlunoResponse";
    	/**
    	 * An error response primitive for updateMergeAluno.
    	 *
    	 * @see #UPDATE_MERGE_ALUNO the request primitive
    	 */
    	String UPDATE_MERGE_ALUNO_ERROR = "updateMergeAlunoError";
    	/**
    	 * The 'delete' request primitive for the Aluno entity.
    	 * @see Aluno.Id the request payload
    	 */
    	String DELETE_ALUNO = "deleteAluno";
    	/**
    	 * The success response primitive for deleteAluno.
    	 *
    	 * @see #DELETE_ALUNO the request primitive
    	 */
    	String DELETE_ALUNO_RESPONSE = "deleteAlunoResponse";
    	/**
    	 * An error response primitive for deleteAluno.
    	 *
    	 * @see #DELETE_ALUNO the request primitive
    	 */
    	String DELETE_ALUNO_ERROR = "deleteAlunoError";
    	/**
    	 * The 'create' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String CREATE_TURMA = "createTurma";
    	/**
    	 * The success response primitive for createTurma.
    	 *
    	 * @see #CREATE_TURMA the request primitive
    	 */
    	String CREATE_TURMA_RESPONSE = "createTurmaResponse";
    	/**
    	 * An error response primitive for createTurma.
    	 *
    	 * @see #CREATE_TURMA the request primitive
    	 */
    	String CREATE_TURMA_ERROR = "createTurmaError";
    	/**
    	 * The 'createBulk' request primitive for the Turma entity.
    	 * @see CreateBulkTurmaInput the request payload
    	 */
    	String CREATE_BULK_TURMA = "createBulkTurma";
    	/**
    	 * The success response primitive for createBulkTurma.
    	 *
    	 * @see #CREATE_BULK_TURMA the request primitive
    	 * @see CreateBulkTurmaOutput the response payload
    	 */
    	String CREATE_BULK_TURMA_RESPONSE = "createBulkTurmaResponse";
    	/**
    	 * An error response primitive for createBulkTurma.
    	 *
    	 * @see #CREATE_BULK_TURMA the request primitive
    	 */
    	String CREATE_BULK_TURMA_ERROR = "createBulkTurmaError";
    	/**
    	 * The 'createMerge' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String CREATE_MERGE_TURMA = "createMergeTurma";
    	/**
    	 * The success response primitive for createMergeTurma.
    	 *
    	 * @see #CREATE_MERGE_TURMA the request primitive
    	 */
    	String CREATE_MERGE_TURMA_RESPONSE = "createMergeTurmaResponse";
    	/**
    	 * An error response primitive for createMergeTurma.
    	 *
    	 * @see #CREATE_MERGE_TURMA the request primitive
    	 */
    	String CREATE_MERGE_TURMA_ERROR = "createMergeTurmaError";
    	/**
    	 * The 'retrieve' request primitive for the Turma entity.
    	 * @see Turma.Id the request payload
    	 */
    	String RETRIEVE_TURMA = "retrieveTurma";
    	/**
    	 * The success response primitive for retrieveTurma.
    	 *
    	 * @see #RETRIEVE_TURMA the request primitive
    	 */
    	String RETRIEVE_TURMA_RESPONSE = "retrieveTurmaResponse";
    	/**
    	 * An error response primitive for retrieveTurma.
    	 *
    	 * @see #RETRIEVE_TURMA the request primitive
    	 */
    	String RETRIEVE_TURMA_ERROR = "retrieveTurmaError";
    	/**
    	 * The 'update' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String UPDATE_TURMA = "updateTurma";
    	/**
    	 * The success response primitive for updateTurma.
    	 *
    	 * @see #UPDATE_TURMA the request primitive
    	 */
    	String UPDATE_TURMA_RESPONSE = "updateTurmaResponse";
    	/**
    	 * An error response primitive for updateTurma.
    	 *
    	 * @see #UPDATE_TURMA the request primitive
    	 */
    	String UPDATE_TURMA_ERROR = "updateTurmaError";
    	/**
    	 * The 'updateMerge' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String UPDATE_MERGE_TURMA = "updateMergeTurma";
    	/**
    	 * The success response primitive for updateMergeTurma.
    	 *
    	 * @see #UPDATE_MERGE_TURMA the request primitive
    	 */
    	String UPDATE_MERGE_TURMA_RESPONSE = "updateMergeTurmaResponse";
    	/**
    	 * An error response primitive for updateMergeTurma.
    	 *
    	 * @see #UPDATE_MERGE_TURMA the request primitive
    	 */
    	String UPDATE_MERGE_TURMA_ERROR = "updateMergeTurmaError";
    	/**
    	 * The 'delete' request primitive for the Turma entity.
    	 * @see Turma.Id the request payload
    	 */
    	String DELETE_TURMA = "deleteTurma";
    	/**
    	 * The success response primitive for deleteTurma.
    	 *
    	 * @see #DELETE_TURMA the request primitive
    	 */
    	String DELETE_TURMA_RESPONSE = "deleteTurmaResponse";
    	/**
    	 * An error response primitive for deleteTurma.
    	 *
    	 * @see #DELETE_TURMA the request primitive
    	 */
    	String DELETE_TURMA_ERROR = "deleteTurmaError";
    	/**
    	 * The 'create' request primitive for the Avaliacao entity.
    	 * @see Avaliacao the request payload
    	 */
    	String CREATE_AVALIACAO = "createAvaliacao";
    	/**
    	 * The success response primitive for createAvaliacao.
    	 *
    	 * @see #CREATE_AVALIACAO the request primitive
    	 */
    	String CREATE_AVALIACAO_RESPONSE = "createAvaliacaoResponse";
    	/**
    	 * An error response primitive for createAvaliacao.
    	 *
    	 * @see #CREATE_AVALIACAO the request primitive
    	 */
    	String CREATE_AVALIACAO_ERROR = "createAvaliacaoError";
    	/**
    	 * The 'createBulk' request primitive for the Avaliacao entity.
    	 * @see CreateBulkAvaliacaoInput the request payload
    	 */
    	String CREATE_BULK_AVALIACAO = "createBulkAvaliacao";
    	/**
    	 * The success response primitive for createBulkAvaliacao.
    	 *
    	 * @see #CREATE_BULK_AVALIACAO the request primitive
    	 * @see CreateBulkAvaliacaoOutput the response payload
    	 */
    	String CREATE_BULK_AVALIACAO_RESPONSE = "createBulkAvaliacaoResponse";
    	/**
    	 * An error response primitive for createBulkAvaliacao.
    	 *
    	 * @see #CREATE_BULK_AVALIACAO the request primitive
    	 */
    	String CREATE_BULK_AVALIACAO_ERROR = "createBulkAvaliacaoError";
    	/**
    	 * The 'createMerge' request primitive for the Avaliacao entity.
    	 * @see Avaliacao the request payload
    	 */
    	String CREATE_MERGE_AVALIACAO = "createMergeAvaliacao";
    	/**
    	 * The success response primitive for createMergeAvaliacao.
    	 *
    	 * @see #CREATE_MERGE_AVALIACAO the request primitive
    	 */
    	String CREATE_MERGE_AVALIACAO_RESPONSE = "createMergeAvaliacaoResponse";
    	/**
    	 * An error response primitive for createMergeAvaliacao.
    	 *
    	 * @see #CREATE_MERGE_AVALIACAO the request primitive
    	 */
    	String CREATE_MERGE_AVALIACAO_ERROR = "createMergeAvaliacaoError";
    	/**
    	 * The 'retrieve' request primitive for the Avaliacao entity.
    	 * @see Avaliacao.Id the request payload
    	 */
    	String RETRIEVE_AVALIACAO = "retrieveAvaliacao";
    	/**
    	 * The success response primitive for retrieveAvaliacao.
    	 *
    	 * @see #RETRIEVE_AVALIACAO the request primitive
    	 */
    	String RETRIEVE_AVALIACAO_RESPONSE = "retrieveAvaliacaoResponse";
    	/**
    	 * An error response primitive for retrieveAvaliacao.
    	 *
    	 * @see #RETRIEVE_AVALIACAO the request primitive
    	 */
    	String RETRIEVE_AVALIACAO_ERROR = "retrieveAvaliacaoError";
    	/**
    	 * The 'update' request primitive for the Avaliacao entity.
    	 * @see Avaliacao the request payload
    	 */
    	String UPDATE_AVALIACAO = "updateAvaliacao";
    	/**
    	 * The success response primitive for updateAvaliacao.
    	 *
    	 * @see #UPDATE_AVALIACAO the request primitive
    	 */
    	String UPDATE_AVALIACAO_RESPONSE = "updateAvaliacaoResponse";
    	/**
    	 * An error response primitive for updateAvaliacao.
    	 *
    	 * @see #UPDATE_AVALIACAO the request primitive
    	 */
    	String UPDATE_AVALIACAO_ERROR = "updateAvaliacaoError";
    	/**
    	 * The 'updateMerge' request primitive for the Avaliacao entity.
    	 * @see Avaliacao the request payload
    	 */
    	String UPDATE_MERGE_AVALIACAO = "updateMergeAvaliacao";
    	/**
    	 * The success response primitive for updateMergeAvaliacao.
    	 *
    	 * @see #UPDATE_MERGE_AVALIACAO the request primitive
    	 */
    	String UPDATE_MERGE_AVALIACAO_RESPONSE = "updateMergeAvaliacaoResponse";
    	/**
    	 * An error response primitive for updateMergeAvaliacao.
    	 *
    	 * @see #UPDATE_MERGE_AVALIACAO the request primitive
    	 */
    	String UPDATE_MERGE_AVALIACAO_ERROR = "updateMergeAvaliacaoError";
    	/**
    	 * The 'delete' request primitive for the Avaliacao entity.
    	 * @see Avaliacao.Id the request payload
    	 */
    	String DELETE_AVALIACAO = "deleteAvaliacao";
    	/**
    	 * The success response primitive for deleteAvaliacao.
    	 *
    	 * @see #DELETE_AVALIACAO the request primitive
    	 */
    	String DELETE_AVALIACAO_RESPONSE = "deleteAvaliacaoResponse";
    	/**
    	 * An error response primitive for deleteAvaliacao.
    	 *
    	 * @see #DELETE_AVALIACAO the request primitive
    	 */
    	String DELETE_AVALIACAO_ERROR = "deleteAvaliacaoError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_PROFESSOR_EVENT = "importProfessorEvent";
    	String EXPORT_PROFESSOR_EVENT = "exportProfessorEvent";
    	String IMPORT_ALUNO_EVENT = "importAlunoEvent";
    	String EXPORT_ALUNO_EVENT = "exportAlunoEvent";
    	String IMPORT_TURMA_EVENT = "importTurmaEvent";
    	String EXPORT_TURMA_EVENT = "exportTurmaEvent";
    	String IMPORT_AVALIACAO_EVENT = "importAvaliacaoEvent";
    	String EXPORT_AVALIACAO_EVENT = "exportAvaliacaoEvent";
    }
    
}
