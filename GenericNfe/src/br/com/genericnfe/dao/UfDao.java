package br.com.genericnfe.dao;

import br.com.genericnfe.connections.ConexaoOracle;
import br.com.genericnfe.model.Uf;
import br.com.genericnfe.tools.UltimaSequencia;

/**
 *
 * @author jsoliveira
 */
public class UfDao {

    Uf u = new Uf();
    UltimaSequencia us = new UltimaSequencia("CD_UF", "CAD_UF");
    //ConexaoOracle  

    public void salvar(Uf u) {
        
        u.setCd_uf(Integer.parseInt(us.ult));
     
        StringBuffer insert = new StringBuffer("INSERT INTO CAD_UF(CD_UF,NM_UF,SG_UF,DT_TRANSACAO) VALUES");
                                  insert.append("(");
                                  insert.append(u.getCd_uf()).append(",");
                                  insert.append(u.getNm_uf()).append("',");
                                  insert.append(u.getSg_ug()).append("',");
                                  
                                  
                                  
        
    }
}
