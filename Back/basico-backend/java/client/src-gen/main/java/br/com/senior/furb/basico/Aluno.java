package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

/**
 * Entidade que representa o aluno
 */
@EntityDescription
public class Aluno {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String alunoId) {
            this.id = alunoId;
        }
        
        public String getAlunoId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		BasicoNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Aluno> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Aluno> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Aluno> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        public boolean useCustomFilter;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
       	
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this(offset, size, orderBy, filter, displayFields, false);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields, boolean useCustomFilter) {
        	this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        	this.useCustomFilter = useCustomFilter;
        }
    }

    @EntityId
    /**
     * Chave primaria
     */
    public String id;
    /**
     * Nome do aluno
     */
    public String nome;
    /**
     * Data de nascimento
     */
    public java.time.LocalDate dataNascimento;
    /**
     * Data de início
     */
    public java.time.LocalDate dataInicio;
    /**
     * Notas
     */
    public java.util.List<Avaliacao> notas;
    
    public Aluno() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Aluno(String id, String nome, java.time.LocalDate dataNascimento, java.time.LocalDate dataInicio, java.util.List<Avaliacao> notas) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataInicio = dataInicio;
        this.notas = notas;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Aluno(String nome, java.time.LocalDate dataNascimento, java.time.LocalDate dataInicio, java.util.List<Avaliacao> notas) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataInicio = dataInicio;
        this.notas = notas;
    }
    
    public void normalize(Map<String, Object> headers) {
    	BasicoNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
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
        if (!(obj instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) obj;
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
    		int last = notas.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			notas.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
