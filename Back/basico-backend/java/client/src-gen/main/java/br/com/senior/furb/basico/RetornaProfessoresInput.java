package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class RetornaProfessoresInput {
    
    /**
     * ID do professor
     */
    public String idProfessor;
    
    public RetornaProfessoresInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornaProfessoresInput(String idProfessor) {
        this.idProfessor = idProfessor;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
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
        if (idProfessor != null) {
            ret = 31 * ret + idProfessor.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornaProfessoresInput)) {
            return false;
        }
        RetornaProfessoresInput other = (RetornaProfessoresInput) obj;
        if ((idProfessor == null) != (other.idProfessor == null)) {
            return false;
        }
        if ((idProfessor != null) && !idProfessor.equals(other.idProfessor)) {
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
    	sb.append("idProfessor=").append(idProfessor == null ? "null" : idProfessor);
    	sb.append(']');
    }
    
}
