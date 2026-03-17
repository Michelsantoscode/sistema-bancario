package com.michel.main.model;

public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Agencia: " + agencia + "\n" +
                "com.michel.main.model.Conta: : " + numeroConta + "\n";
    }



}
