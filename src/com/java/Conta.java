package com.java;

public class Conta {
    private int numero;
    private double saldo;

    int agencia;

    // caso eu não queira atribuir construtor
    public Conta () {

    }

    public Conta (int numero) {
      this.numero = numero;
      this.saldo = 0;
    }

    Cliente cliente = new Cliente();

    public double recuperarSaldo () {
        return this.saldo;
    }

    public void depositar (double valor) {
        this.saldo = saldo + valor;
    }

    // Sobrecarga de método
    public void retirar (double valor) {
        this.saldo = saldo - valor;
    }

    public void retirar (double valor, double taxa) {
        this.saldo = saldo - valor - taxa;
    }

    // Não criar métodos com nomes diferentes se temos a possibilidade de sobrecarga
    public void setAgencia (int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
}
