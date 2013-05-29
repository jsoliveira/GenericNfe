
package br.com.genericnfe.model;

import java.util.Date;

public class Operacao {
    
    private int cd_operacao;
    private String nm_operacao;
    private Date dt_transacao;

    public Operacao() {}

    public Operacao(int cd_operacao, String nm_operacao, Date dt_transacao) {
        this.cd_operacao = cd_operacao;
        this.nm_operacao = nm_operacao;
        this.dt_transacao = dt_transacao;
    }

    public int getCd_operacao() {
        return cd_operacao;
    }

    public void setCd_operacao(int cd_operacao) {
        this.cd_operacao = cd_operacao;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public String getNm_operacao() {
        return nm_operacao;
    }

    public void setNm_operacao(String nm_operacao) {
        this.nm_operacao = nm_operacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operacao other = (Operacao) obj;
        if (this.cd_operacao != other.cd_operacao) {
            return false;
        }
        if ((this.nm_operacao == null) ? (other.nm_operacao != null) : !this.nm_operacao.equals(other.nm_operacao)) {
            return false;
        }
        if (this.dt_transacao != other.dt_transacao && (this.dt_transacao == null || !this.dt_transacao.equals(other.dt_transacao))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.cd_operacao;
        hash = 59 * hash + (this.nm_operacao != null ? this.nm_operacao.hashCode() : 0);
        hash = 59 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return nm_operacao ;
    }
    
    
    
    
}
