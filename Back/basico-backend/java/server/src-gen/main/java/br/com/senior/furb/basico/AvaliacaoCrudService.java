/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Avaliacao.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface AvaliacaoCrudService extends CrudService<AvaliacaoEntity> {
	
	public AvaliacaoEntity createAvaliacao(AvaliacaoEntity toCreate);
	
	@Deprecated
	public AvaliacaoEntity createMergeAvaliacao(AvaliacaoEntity toCreateMerge);
	
	public AvaliacaoEntity updateAvaliacao(AvaliacaoEntity toUpdate);
	
	@Deprecated
	public AvaliacaoEntity updateMergeAvaliacao(AvaliacaoEntity toUpdateMerge);
	
	public void deleteAvaliacao(Id id);
	
	public AvaliacaoEntity retrieveAvaliacao(Id id);
	
	@Deprecated
	public List<AvaliacaoEntity> listAvaliacao(int skip, int top);
	
	public Page<AvaliacaoEntity> listAvaliacaoPageable(int skip, int top);
	
	public Page<AvaliacaoEntity> listAvaliacaoPageable(int skip, int top, String orderBy);
	
	public Page<AvaliacaoEntity> listAvaliacaoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<AvaliacaoEntity> listAvaliacaoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkAvaliacao(List<AvaliacaoEntity> entities);

	public AvaliacaoBaseRepository getRepository();
	
}
