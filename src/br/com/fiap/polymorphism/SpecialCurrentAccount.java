package br.com.fiap.polymorphism;

import br.com.fiap.polymorphism.interfaces.Transference;

public class SpecialCurrentAccount extends CurrentAccount implements Transference {

    private double limit;

    @Override
    public void withdraw (double value) throws NoSuchBalance {
        if (value > balance + limit) {
            throw new NoSuchBalance();
        }
        balance -= value;
    }

    // métodos vindos da interface Transference
    @Override
    public boolean realizeDoc(int bank, int account, int branch, double value) {
        return false;
    }

    @Override
    public boolean realizeTed(int bank, int accoutn, int branch, double value) {
        return false;
    }
}
