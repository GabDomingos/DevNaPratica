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

@Component("furb.basico.ProfessorDTOConverter")
@Lazy
public class ProfessorDTOConverter extends EntityDTOConverter {

	@Autowired
	private TurmaDTOConverter turmaConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter <List<Turma>, List<TurmaEntity>> turmasConverter = new ContextualizedConverter<List<Turma>, List<TurmaEntity>>() {
			@Override
			public List<TurmaEntity> convert(List<Turma> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, TurmaEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Professor, ProfessorEntity> professorMap = new PropertyMap<Professor, ProfessorEntity>() {
			@Override
			protected void configure() {
				using(turmasConverter).map(source.turmas).setTurmas(null);
			}
		};
		mapper.addMappings(professorMap);
		if (mapper.getTypeMap(Turma.class, TurmaEntity.class) == null) {
			this.turmaConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Professor.class, ProfessorEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter <List<TurmaEntity>, List<Turma>> turmasConverter = new ContextualizedConverter<List<TurmaEntity>, List<Turma>>() {
			@Override
			public List<Turma> convert(List<TurmaEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Turma.class, conversionContext.getRelationshipFields("turmas"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Turma.class, conversionContext.getRelationshipFields("turmas"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<ProfessorEntity, Professor> professorMap = new PropertyMap<ProfessorEntity, Professor>() {
			@Override
			public void configure() {
				using(turmasConverter).map(source.getTurmas(), destination.turmas);
			}
		};
		//lazy relationships
		
		mapper.addMappings(professorMap);
		
		if (mapper.getTypeMap(TurmaEntity.class, Turma.class) == null) {
		    this.turmaConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(ProfessorEntity.class, Professor.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
