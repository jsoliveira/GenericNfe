/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Parametros {
    
    private int    cd_parametros;
    private String ds_sv_proxy;
    private int    nr_pt_proxy;
    private String us_proxy;
    private String pw_proxy;
    private String dir_lotes_gerados;
    private String dor_lotes_autorizados;
    private Date   dt_transacao;
    
    
    public Parametros(){}

    public Parametros(int cd_parametros, String ds_sv_proxy, int nr_pt_proxy, String us_proxy, String pw_proxy, String dir_lotes_gerados, String dor_lotes_autorizados, Date dt_transacao) {
        this.cd_parametros = cd_parametros;
        this.ds_sv_proxy = ds_sv_proxy;
        this.nr_pt_proxy = nr_pt_proxy;
        this.us_proxy = us_proxy;
        this.pw_proxy = pw_proxy;
        this.dir_lotes_gerados = dir_lotes_gerados;
        this.dor_lotes_autorizados = dor_lotes_autorizados;
        this.dt_transacao = dt_transacao;
    }

    
    
    public int getCd_parametros() {
        return cd_parametros;
    }

    public void setCd_parametros(int cd_parametros) {
        this.cd_parametros = cd_parametros;
    }

    public String getDir_lotes_gerados() {
        return dir_lotes_gerados;
    }

    public void setDir_lotes_gerados(String dir_lotes_gerados) {
        this.dir_lotes_gerados = dir_lotes_gerados;
    }

    public String getDor_lotes_autorizados() {
        return dor_lotes_autorizados;
    }

    public void setDor_lotes_autorizados(String dor_lotes_autorizados) {
        this.dor_lotes_autorizados = dor_lotes_autorizados;
    }

    public String getDs_sv_proxy() {
        return ds_sv_proxy;
    }

    public void setDs_sv_proxy(String ds_sv_proxy) {
        this.ds_sv_proxy = ds_sv_proxy;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public int getNr_pt_proxy() {
        return nr_pt_proxy;
    }

    public void setNr_pt_proxy(int nr_pt_proxy) {
        this.nr_pt_proxy = nr_pt_proxy;
    }

    public String getPw_proxy() {
        return pw_proxy;
    }

    public void setPw_proxy(String pw_proxy) {
        this.pw_proxy = pw_proxy;
    }

    public String getUs_proxy() {
        return us_proxy;
    }

    public void setUs_proxy(String us_proxy) {
        this.us_proxy = us_proxy;
    }

    @Override
    public String toString() {
        return "Parametros{" + "ds_sv_proxy=" + ds_sv_proxy + ", nr_pt_proxy=" + nr_pt_proxy + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parametros other = (Parametros) obj;
        if (this.cd_parametros != other.cd_parametros) {
            return false;
        }
        if ((this.ds_sv_proxy == null) ? (other.ds_sv_proxy != null) : !this.ds_sv_proxy.equals(other.ds_sv_proxy)) {
            return false;
        }
        if (this.nr_pt_proxy != other.nr_pt_proxy) {
            return false;
        }
        if ((this.us_proxy == null) ? (other.us_proxy != null) : !this.us_proxy.equals(other.us_proxy)) {
            return false;
        }
        if ((this.pw_proxy == null) ? (other.pw_proxy != null) : !this.pw_proxy.equals(other.pw_proxy)) {
            return false;
        }
        if ((this.dir_lotes_gerados == null) ? (other.dir_lotes_gerados != null) : !this.dir_lotes_gerados.equals(other.dir_lotes_gerados)) {
            return false;
        }
        if ((this.dor_lotes_autorizados == null) ? (other.dor_lotes_autorizados != null) : !this.dor_lotes_autorizados.equals(other.dor_lotes_autorizados)) {
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
        hash = 97 * hash + this.cd_parametros;
        hash = 97 * hash + (this.ds_sv_proxy != null ? this.ds_sv_proxy.hashCode() : 0);
        hash = 97 * hash + this.nr_pt_proxy;
        hash = 97 * hash + (this.us_proxy != null ? this.us_proxy.hashCode() : 0);
        hash = 97 * hash + (this.pw_proxy != null ? this.pw_proxy.hashCode() : 0);
        hash = 97 * hash + (this.dir_lotes_gerados != null ? this.dir_lotes_gerados.hashCode() : 0);
        hash = 97 * hash + (this.dor_lotes_autorizados != null ? this.dor_lotes_autorizados.hashCode() : 0);
        hash = 97 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }
    
    
    
    
}
