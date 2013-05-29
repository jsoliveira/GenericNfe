
package br.com.genericnfe.model;

import java.util.Date;


public class ProdutoServico {
    
    private int cd_prodserv;
    private String ds_proserv;
    private String sg_unidademedida;
    private Double vl_proserv;
    private String nr_ncm;
    private int    un_comercial;
    private Double vl_un_comercial;
    private int    un_tributario;
    private int    qtde_tributado;
    private Double vl_unit_tributado;
    private String nr_cfop;
    private Date   dt_transacao;

    public ProdutoServico() {
    }

    public ProdutoServico(int cd_prodserv, String ds_proserv, String sg_unidademedida, Double vl_proserv, String nr_ncm, int un_comercial, Double vl_un_comercial, int un_tributario, int qtde_tributado, Double vl_unit_tributado, String nr_cfop, Date dt_transacao) {
        this.cd_prodserv = cd_prodserv;
        this.ds_proserv = ds_proserv;
        this.sg_unidademedida = sg_unidademedida;
        this.vl_proserv = vl_proserv;
        this.nr_ncm = nr_ncm;
        this.un_comercial = un_comercial;
        this.vl_un_comercial = vl_un_comercial;
        this.un_tributario = un_tributario;
        this.qtde_tributado = qtde_tributado;
        this.vl_unit_tributado = vl_unit_tributado;
        this.nr_cfop = nr_cfop;
        this.dt_transacao = dt_transacao;
    }

    public int getCd_prodserv() {
        return cd_prodserv;
    }

    public void setCd_prodserv(int cd_prodserv) {
        this.cd_prodserv = cd_prodserv;
    }

    public String getDs_proserv() {
        return ds_proserv;
    }

    public void setDs_proserv(String ds_proserv) {
        this.ds_proserv = ds_proserv;
    }

    public Date getDt_transacao() {
        return dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        this.dt_transacao = dt_transacao;
    }

    public String getNr_cfop() {
        return nr_cfop;
    }

    public void setNr_cfop(String nr_cfop) {
        this.nr_cfop = nr_cfop;
    }

    public String getNr_ncm() {
        return nr_ncm;
    }

    public void setNr_ncm(String nr_ncm) {
        this.nr_ncm = nr_ncm;
    }

    public int getQtde_tributado() {
        return qtde_tributado;
    }

    public void setQtde_tributado(int qtde_tributado) {
        this.qtde_tributado = qtde_tributado;
    }

    public String getSg_unidademedida() {
        return sg_unidademedida;
    }

    public void setSg_unidademedida(String sg_unidademedida) {
        this.sg_unidademedida = sg_unidademedida;
    }

    public int getUn_comercial() {
        return un_comercial;
    }

    public void setUn_comercial(int un_comercial) {
        this.un_comercial = un_comercial;
    }

    public int getUn_tributario() {
        return un_tributario;
    }

    public void setUn_tributario(int un_tributario) {
        this.un_tributario = un_tributario;
    }

    public Double getVl_proserv() {
        return vl_proserv;
    }

    public void setVl_proserv(Double vl_proserv) {
        this.vl_proserv = vl_proserv;
    }

    public Double getVl_un_comercial() {
        return vl_un_comercial;
    }

    public void setVl_un_comercial(Double vl_un_comercial) {
        this.vl_un_comercial = vl_un_comercial;
    }

    public Double getVl_unit_tributado() {
        return vl_unit_tributado;
    }

    public void setVl_unit_tributado(Double vl_unit_tributado) {
        this.vl_unit_tributado = vl_unit_tributado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoServico other = (ProdutoServico) obj;
        if (this.cd_prodserv != other.cd_prodserv) {
            return false;
        }
        if ((this.ds_proserv == null) ? (other.ds_proserv != null) : !this.ds_proserv.equals(other.ds_proserv)) {
            return false;
        }
        if ((this.sg_unidademedida == null) ? (other.sg_unidademedida != null) : !this.sg_unidademedida.equals(other.sg_unidademedida)) {
            return false;
        }
        if (this.vl_proserv != other.vl_proserv && (this.vl_proserv == null || !this.vl_proserv.equals(other.vl_proserv))) {
            return false;
        }
        if ((this.nr_ncm == null) ? (other.nr_ncm != null) : !this.nr_ncm.equals(other.nr_ncm)) {
            return false;
        }
        if (this.un_comercial != other.un_comercial) {
            return false;
        }
        if (this.vl_un_comercial != other.vl_un_comercial && (this.vl_un_comercial == null || !this.vl_un_comercial.equals(other.vl_un_comercial))) {
            return false;
        }
        if (this.un_tributario != other.un_tributario) {
            return false;
        }
        if (this.qtde_tributado != other.qtde_tributado) {
            return false;
        }
        if (this.vl_unit_tributado != other.vl_unit_tributado && (this.vl_unit_tributado == null || !this.vl_unit_tributado.equals(other.vl_unit_tributado))) {
            return false;
        }
        if ((this.nr_cfop == null) ? (other.nr_cfop != null) : !this.nr_cfop.equals(other.nr_cfop)) {
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
        hash = 67 * hash + this.cd_prodserv;
        hash = 67 * hash + (this.ds_proserv != null ? this.ds_proserv.hashCode() : 0);
        hash = 67 * hash + (this.sg_unidademedida != null ? this.sg_unidademedida.hashCode() : 0);
        hash = 67 * hash + (this.vl_proserv != null ? this.vl_proserv.hashCode() : 0);
        hash = 67 * hash + (this.nr_ncm != null ? this.nr_ncm.hashCode() : 0);
        hash = 67 * hash + this.un_comercial;
        hash = 67 * hash + (this.vl_un_comercial != null ? this.vl_un_comercial.hashCode() : 0);
        hash = 67 * hash + this.un_tributario;
        hash = 67 * hash + this.qtde_tributado;
        hash = 67 * hash + (this.vl_unit_tributado != null ? this.vl_unit_tributado.hashCode() : 0);
        hash = 67 * hash + (this.nr_cfop != null ? this.nr_cfop.hashCode() : 0);
        hash = 67 * hash + (this.dt_transacao != null ? this.dt_transacao.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ProdutoServico{" + "ds_proserv=" + ds_proserv + ", sg_unidademedida=" + sg_unidademedida + ", vl_proserv=" + vl_proserv + ", nr_ncm=" + nr_ncm + ", un_comercial=" + un_comercial + ", vl_un_comercial=" + vl_un_comercial + '}';
    }
    
    
    
    
    
    
    
    
}
