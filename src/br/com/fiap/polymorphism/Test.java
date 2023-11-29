package br.com.fiap.polymorphism;

public class Test {
    public static void main(String[] args) {
        CurrentAccount account = new SpecialCurrentAccount();

        try {
            account.withdraw(20);
        } catch (NoSuchBalance e) {
            e.printStackTrace();
        }
    }
}
