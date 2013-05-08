package br.com.genericnfe.model;

/**
 *
 * @author jsoliveira
 */
public abstract class TelaPrincipal {

    private int bancoDados;///0-ORACLE 1-POSTGRESSQL
    private int bancoVersao; ///0-DESENVOLVIMENTO 1-PRODUCAO

    public int getBancoDados() {
        return bancoDados;
    }

    public void setBancoDados(int bancoDados) {
        this.bancoDados = bancoDados;
    }

    public int getBancoVersao() {
        return bancoVersao;
    }

    public void setBancoVersao(int bancoVersao) {
        this.bancoVersao = bancoVersao;
    }
    
    
    
}
