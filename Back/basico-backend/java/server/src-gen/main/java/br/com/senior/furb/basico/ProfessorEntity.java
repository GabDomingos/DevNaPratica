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
@Table(name="professor")
public class ProfessorEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/professor";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Nome do professor
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * Data de nascimento
	 */
	@Column(name = "data_nascimento")
	private java.time.LocalDate dataNascimento;
	
	/**
	 * Data de contratação
	 */
	@Column(name = "data_contratacao")
	private java.time.LocalDate dataContratacao;
	
	/**
	 * Salário
	 */
	@Column(name = "salario")
	private Double salario;
	
	/**
	 * Lista de turmas
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "professor_turmas",
	          joinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "turmas_id", referencedColumnName = "id"))
	private java.util.List<TurmaEntity> turmas;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public java.time.LocalDate getDataContratacao() {
		return dataContratacao;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public java.util.List<TurmaEntity> getTurmas() {
		return turmas;
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
	
	public void setDataContratacao(java.time.LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setTurmas(java.util.List<TurmaEntity> turmas) {
		this.turmas = turmas;
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
	    if (!(obj instanceof ProfessorEntity)) {
	        return false;
	    }
	    ProfessorEntity other = (ProfessorEntity) obj;
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
		sb.append("dataContratacao=").append(dataContratacao == null ? "null" : dataContratacao).append(", ");
		sb.append("salario=").append(salario == null ? "null" : salario).append(", ");
		sb.append("turmas=<");
		if (turmas == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<TurmaEntity> iterator = turmas.iterator();
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
