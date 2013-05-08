package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class Uf {

    private int cd_uf;
    private String nm_uf;
    private String sg_ug;
    private Date dt_transacao;

    public Uf() {
    }

    public Uf(int cd_uf, String nm_uf, String sg_ug, Date dt_transacao) {
        this.cd_uf = cd_uf;
        this.nm_uf = nm_uf;
        this.sg_ug = sg_ug;
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

    public String getSg_ug() {
        return sg_ug;
    }

    public void setSg_ug(String sg_ug) {
        this.sg_ug = sg_ug;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }
}
