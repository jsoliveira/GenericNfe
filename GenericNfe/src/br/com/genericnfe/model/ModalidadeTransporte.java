
package br.com.genericnfe.model;

import java.util.Date;

public class ModalidadeTransporte {
    
    private int cd_modalidade;
    private String ds_modalidade;
    private Date dt_transacao;

    public ModalidadeTransporte() {
    }

    public ModalidadeTransporte(int cd_modalidade, String ds_modalidade, Date dt_transacao) {
        this.cd_modalidade = cd_modalidade;
        this.ds_modalidade = ds_modalidade;
        this.dt_transacao = dt_transacao;
    }

    public int getCd_modalidade() {
        return cd_modalidade;
    }

    public void setCd_modalidade(int cd_modalidade) {
        this.cd_modalidade = cd_modalidade;
    }

    public String getDs_modalidade() {
        return ds_modalidade;
    }

    public void setDs_modalidade(String ds_modalidade) {
        this.ds_modalidade = ds_modalidade;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModalidadeTransporte other = (ModalidadeTransporte) obj;
        if (this.cd_modalidade != other.cd_modalidade) {
            return false;
        }
        if ((this.ds_modalidade == null) ? (other.ds_modalidade != null) : !this.ds_modalidade.equals(other.ds_modalidade)) {
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
        hash = 19 * hash + this.cd_modalidade;
        hash = 19 * hash + (this.ds_modalidade != null ? this.ds_modalidade.hashCode() : 0);
        hash = 19 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return ds_modalidade;
    }
    
    
    
    
}
