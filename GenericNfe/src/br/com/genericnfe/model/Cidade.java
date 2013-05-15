
package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class Cidade {
    
    private int cd_cidade;
    private Uf uf;
    private String nm_cidade;
    private Date dt_transacao;

    public Cidade() {
    }

    public Cidade(int cd_cidade, Uf uf, String nm_cidade, Date dt_transacao) {
        this.cd_cidade = cd_cidade;
        this.uf = uf;
        this.nm_cidade = nm_cidade;
        this.dt_transacao = dt_transacao;
    }

        
    public int getCd_cidade() {
        return cd_cidade;
    }

    public void setCd_cidade(int cd_cidade) {
        this.cd_cidade = cd_cidade;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public String getNm_cidade() {
        return nm_cidade;
    }

    public void setNm_cidade(String nm_cidade) {
        this.nm_cidade = nm_cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }
    
    
    
    
}
