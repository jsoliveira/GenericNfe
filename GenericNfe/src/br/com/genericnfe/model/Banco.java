package br.com.genericnfe.model;

/**
 *
 * @author jsoliveira
 */
public enum Banco {

    BANCO;
    private int banco;

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    private int base;
}
