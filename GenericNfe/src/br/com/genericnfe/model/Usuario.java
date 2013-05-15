
package br.com.genericnfe.model;

import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class Usuario {

    
    private int cd_usuario;
    private String nm_usuario;
    private String ds_usuario;
    private String pw_usuario;
    private Date dt_transacao;

    public Usuario() {
    }

    public Usuario(int cd_usuario, String nm_usuario, String ds_usuario, String pw_usuario, Date dt_transacao) {
        this.cd_usuario = cd_usuario;
        this.nm_usuario = nm_usuario;
        this.ds_usuario = ds_usuario;
        this.pw_usuario = pw_usuario;
        this.dt_transacao = dt_transacao;
    }

    
    public int getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getDs_usuario() {
        return ds_usuario;
    }

    public void setDs_usuario(String ds_usuario) {
        this.ds_usuario = ds_usuario;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getPw_usuario() {
        return pw_usuario;
    }

    public void setPw_usuario(String pw_usuario) {
        this.pw_usuario = pw_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cd_usuario=" + cd_usuario + ", nm_usuario=" + nm_usuario + ", ds_usuario=" + ds_usuario + ", pw_usuario=" + pw_usuario + ", dt_transacao=" + dt_transacao + '}';
    }
    
    
    
    
    
}
