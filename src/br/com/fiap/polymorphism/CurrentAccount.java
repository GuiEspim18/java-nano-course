package br.com.fiap.polymorphism;

public class CurrentAccount {

    protected double balance;

    public void withdraw(double value) throws NoSuchBalance {
        if (value > balance) {
            throw new NoSuchBalance();
        }
        balance -= value;
    }
}
