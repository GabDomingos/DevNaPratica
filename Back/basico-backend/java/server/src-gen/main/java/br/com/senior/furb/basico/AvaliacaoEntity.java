/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="avaliacao")
public class AvaliacaoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/avaliacao";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Descrição da avaliação
	 */
	@Column(name = "desc_nota")
	private String descNota;
	
	/**
	 * Nota
	 */
	@Column(name = "nota")
	private Double nota;
	
	/**
	 * data
	 */
	@Column(name = "data_avaliacao")
	private java.time.LocalDate dataAvaliacao;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getDescNota() {
		return descNota;
	}
	
	public Double getNota() {
		return nota;
	}
	
	public java.time.LocalDate getDataAvaliacao() {
		return dataAvaliacao;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setDescNota(String descNota) {
		this.descNota = descNota;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public void setDataAvaliacao(java.time.LocalDate dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
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
	    if (!(obj instanceof AvaliacaoEntity)) {
	        return false;
	    }
	    AvaliacaoEntity other = (AvaliacaoEntity) obj;
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
		sb.append("descNota=").append(descNota == null ? "null" : descNota).append(", ");
		sb.append("nota=").append(nota == null ? "null" : nota).append(", ");
		sb.append("dataAvaliacao=").append(dataAvaliacao == null ? "null" : dataAvaliacao);
		sb.append(']');
	}
	
}
