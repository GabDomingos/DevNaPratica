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
@Table(name="turma")
public class TurmaEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/turma";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Descrição da turma
	 */
	@Column(name = "desc_turma")
	private String descTurma;
	
	/**
	 * Horário
	 */
	@Column(name = "horario")
	private java.time.LocalTime horario;
	
	/**
	 * Valor da mensalidade
	 */
	@Column(name = "valor_mensalidade")
	private Double valorMensalidade;
	
	/**
	 * Limite de alunos
	 */
	@Column(name = "limite_alunos")
	private Long limiteAlunos;
	
	/**
	 * Lista de alunos
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "turma_alunos",
	          joinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "alunos_id", referencedColumnName = "id"))
	private java.util.List<AlunoEntity> alunos;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getDescTurma() {
		return descTurma;
	}
	
	public java.time.LocalTime getHorario() {
		return horario;
	}
	
	public Double getValorMensalidade() {
		return valorMensalidade;
	}
	
	public Long getLimiteAlunos() {
		return limiteAlunos;
	}
	
	public java.util.List<AlunoEntity> getAlunos() {
		return alunos;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setDescTurma(String descTurma) {
		this.descTurma = descTurma;
	}
	
	public void setHorario(java.time.LocalTime horario) {
		this.horario = horario;
	}
	
	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public void setLimiteAlunos(Long limiteAlunos) {
		this.limiteAlunos = limiteAlunos;
	}
	
	public void setAlunos(java.util.List<AlunoEntity> alunos) {
		this.alunos = alunos;
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
	    if (!(obj instanceof TurmaEntity)) {
	        return false;
	    }
	    TurmaEntity other = (TurmaEntity) obj;
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
		sb.append("descTurma=").append(descTurma == null ? "null" : descTurma).append(", ");
		sb.append("horario=").append(horario == null ? "null" : horario).append(", ");
		sb.append("valorMensalidade=").append(valorMensalidade == null ? "null" : valorMensalidade).append(", ");
		sb.append("limiteAlunos=").append(limiteAlunos == null ? "null" : limiteAlunos).append(", ");
		sb.append("alunos=<");
		if (alunos == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<AlunoEntity> iterator = alunos.iterator();
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
