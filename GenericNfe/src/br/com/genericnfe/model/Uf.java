package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class Uf {

    private int cd_uf;
    private String nm_uf;
    private String sg_uf;
    private Date dt_transacao;

    public Uf() {
    }

    public Uf(int cd_uf, String nm_uf, String sg_uf, Date dt_transacao) {
        this.cd_uf = cd_uf;
        this.nm_uf = nm_uf;
        this.sg_uf = sg_uf;
        this.dt_transacao = dt_transacao;
    }

    public int getCd_uf() {
        return cd_uf;
    }

    public void setCd_uf(int cd_uf) {
        this.cd_uf = cd_uf;
    }

    public String getNm_uf() {
        return nm_uf;
    }

    public void setNm_uf(String nm_uf) {
        this.nm_uf = nm_uf;
    }

    public String getSg_uf() {
        return sg_uf;
    }

    public void setSg_uf(String sg_uf) {
        this.sg_uf = sg_uf;
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
        final Uf other = (Uf) obj;
        if (this.cd_uf != other.cd_uf) {
            return false;
        }
        if ((this.nm_uf == null) ? (other.nm_uf != null) : !this.nm_uf.equals(other.nm_uf)) {
            return false;
        }
        if ((this.sg_uf == null) ? (other.sg_uf != null) : !this.sg_uf.equals(other.sg_uf)) {
            return false;
        }
        if (this.dt_transacao != other.dt_transacao && (this.dt_transacao == null || !this.dt_transacao.equals(other.dt_transacao))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cd_uf;
        hash = 59 * hash + (this.nm_uf != null ? this.nm_uf.hashCode() : 0);
        hash = 59 * hash + (this.sg_uf != null ? this.sg_uf.hashCode() : 0);
        hash = 59 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.getSg_uf();
    }
    
    
    
}
