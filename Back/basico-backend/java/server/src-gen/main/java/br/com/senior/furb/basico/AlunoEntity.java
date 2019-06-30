/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name="aluno")
public class AlunoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/aluno";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Nome do aluno
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * Data de nascimento
	 */
	@Column(name = "data_nascimento")
	private java.time.LocalDate dataNascimento;
	
	/**
	 * Data de início
	 */
	@Column(name = "data_inicio")
	private java.time.LocalDate dataInicio;
	
	/**
	 * Notas
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "aluno_notas",
	          joinColumns = @JoinColumn(name = "aluno_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "notas_id", referencedColumnName = "id"))
	private java.util.List<AvaliacaoEntity> notas;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public java.time.LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public java.util.List<AvaliacaoEntity> getNotas() {
		return notas;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(java.time.LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setDataInicio(java.time.LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public void setNotas(java.util.List<AvaliacaoEntity> notas) {
		this.notas = notas;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof AlunoEntity)) {
	        return false;
	    }
	    AlunoEntity other = (AlunoEntity) obj;
	    if ((id == null) != (other.id == null)) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		sb.append(getClass().getSimpleName()).append(" [");
		if (appended.contains(this)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(this);
		sb.append("id=").append(id == null ? "null" : id).append(", ");
		sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
		sb.append("dataNascimento=").append(dataNascimento == null ? "null" : dataNascimento).append(", ");
		sb.append("dataInicio=").append(dataInicio == null ? "null" : dataInicio).append(", ");
		sb.append("notas=<");
		if (notas == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<AvaliacaoEntity> iterator = notas.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
