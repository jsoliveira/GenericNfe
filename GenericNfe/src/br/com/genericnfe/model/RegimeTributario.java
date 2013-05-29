
package br.com.genericnfe.model;

import java.util.Date;

public class RegimeTributario {
    
    private int    cd_regime;
    private String ds_regime;
    private Date   dt_transacao;

    public RegimeTributario() {
    }

    public RegimeTributario(int cd_regime, String ds_regime, Date dt_transacao) {
        this.cd_regime = cd_regime;
        this.ds_regime = ds_regime;
        this.dt_transacao = dt_transacao;
    }

    public int getCd_regime() {
        return cd_regime;
    }

    public void setCd_regime(int cd_regime) {
        this.cd_regime = cd_regime;
    }

    public String getDs_regime() {
        return ds_regime;
    }

    public void setDs_regime(String ds_regime) {
        this.ds_regime = ds_regime;
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
        final RegimeTributario other = (RegimeTributario) obj;
        if (this.cd_regime != other.cd_regime) {
            return false;
        }
        if ((this.ds_regime == null) ? (other.ds_regime != null) : !this.ds_regime.equals(other.ds_regime)) {
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
        hash = 97 * hash + this.cd_regime;
        hash = 97 * hash + (this.ds_regime != null ? this.ds_regime.hashCode() : 0);
        hash = 97 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  ds_regime ;
    }
    
    
    
    
}
