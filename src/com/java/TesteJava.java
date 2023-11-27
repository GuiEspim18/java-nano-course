package com.java;

public class TesteJava {

    public static  void main (String[] args) {
        Conta contaCorrente = new Conta(11);
        Conta contaPoupanca = new Conta(22);
        Conta contaInvestimento = new Conta(33);

        contaCorrente.cliente.nome = "Guilherme";
        contaCorrente.cliente.idade = 21;
        contaCorrente.depositar(10.0);

        contaPoupanca.cliente.nome = "Heloísa";
        contaPoupanca.cliente.idade = 20;

        contaInvestimento.cliente.nome = "Fulano";
        contaInvestimento.cliente.idade = 40;

        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);


        System.out.println(contaPoupanca.cliente.nome);
        System.out.println(contaPoupanca.cliente.idade);

        System.out.println(contaInvestimento.cliente.nome);
        System.out.println(contaInvestimento.cliente.idade);

    }

}
