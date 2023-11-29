package br.com.fiap.polymorphism.interfaces;

public interface Transference {

    public boolean realizeDoc (int bank, int account, int branch, double value);

    public boolean realizeTed (int bank, int accoutn, int branch, double value);

    // classe que implementar essa interface já vai herdar este método
    default  boolean internalTransference (int branch, int account, double value) {
        // regra do negócio

        return true;
    }

}
