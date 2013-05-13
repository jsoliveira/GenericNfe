package br.com.genericnfe.model;

/**
 *
 * @author jsoliveira
 */
public enum Banco {

    BANCO;
    private static int banco;
    private static int base;

    public static int getBanco() {
        return banco;
    }

    public static void setBanco(int banco) {
        Banco.banco = banco;
    }

    public static int getBase() {
        return base;
    }

    public static void setBase(int base) {
        Banco.base = base;
    }
}
