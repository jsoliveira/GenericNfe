
package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class Pais {
    
    private int cd_pais;
    private String nm_pais;
    private Date dt_transacao;
 

    public Pais() {
    }

    public Pais(int cd_pais, String nm_pais, Date dt_transacao) {
        this.cd_pais = cd_pais;
        this.nm_pais = nm_pais;
        this.dt_transacao = dt_transacao;
    }

    
    public int getCd_pais() {
        return cd_pais;
    }

    public void setCd_pais(int cd_pais) {
        this.cd_pais = cd_pais;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public String getNm_pais() {
        return nm_pais;
    }

    public void setNm_pais(String nm_pais) {
        this.nm_pais = nm_pais;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.cd_pais != other.cd_pais) {
            return false;
        }
        if ((this.nm_pais == null) ? (other.nm_pais != null) : !this.nm_pais.equals(other.nm_pais)) {
            return false;
        }
        if (this.dt_transacao != other.dt_transacao && (this.dt_transacao == null || !this.dt_transacao.equals(other.dt_transacao))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.cd_pais;
        hash = 23 * hash + (this.nm_pais != null ? this.nm_pais.hashCode() : 0);
        hash = 23 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  this.nm_pais ;
    }
    
    
    
    
    
}
