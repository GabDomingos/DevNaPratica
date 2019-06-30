/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.AlunoDTOConverter")
@Lazy
public class AlunoDTOConverter extends EntityDTOConverter {

	@Autowired
	private AvaliacaoDTOConverter avaliacaoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter <List<Avaliacao>, List<AvaliacaoEntity>> notasConverter = new ContextualizedConverter<List<Avaliacao>, List<AvaliacaoEntity>>() {
			@Override
			public List<AvaliacaoEntity> convert(List<Avaliacao> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, AvaliacaoEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Aluno, AlunoEntity> alunoMap = new PropertyMap<Aluno, AlunoEntity>() {
			@Override
			protected void configure() {
				using(notasConverter).map(source.notas).setNotas(null);
			}
		};
		mapper.addMappings(alunoMap);
		if (mapper.getTypeMap(Avaliacao.class, AvaliacaoEntity.class) == null) {
			this.avaliacaoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Aluno.class, AlunoEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter <List<AvaliacaoEntity>, List<Avaliacao>> notasConverter = new ContextualizedConverter<List<AvaliacaoEntity>, List<Avaliacao>>() {
			@Override
			public List<Avaliacao> convert(List<AvaliacaoEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Avaliacao.class, conversionContext.getRelationshipFields("notas"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Avaliacao.class, conversionContext.getRelationshipFields("notas"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<AlunoEntity, Aluno> alunoMap = new PropertyMap<AlunoEntity, Aluno>() {
			@Override
			public void configure() {
				using(notasConverter).map(source.getNotas(), destination.notas);
			}
		};
		//lazy relationships
		
		mapper.addMappings(alunoMap);
		
		if (mapper.getTypeMap(AvaliacaoEntity.class, Avaliacao.class) == null) {
		    this.avaliacaoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(AlunoEntity.class, Aluno.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
