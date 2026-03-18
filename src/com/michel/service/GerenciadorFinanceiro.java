package com.michel.service;

import com.michel.model.Conta;

public class GerenciadorFinanceiro {
    private Conta conta;

    public GerenciadorFinanceiro(Conta conta) {
        this.conta = conta;
    }

    public void sacar (double valor) {
        if (valor > conta.getSaldo()) {
            System.out.println("Saldo Insuficiente");
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque realizado!");
        }
    }

    public void depositar (double valorDeposito) {
        if (valorDeposito <0) {
            System.out.println("Valor inválido para depósito!");
        } else {
            conta.setSaldo(conta.getSaldo() + valorDeposito);
            System.out.println("Deposito Realizado!");
        }
    }

    public void mostrarSaldo () {
        System.out.println("Saldo: " + conta.getSaldo());
    }

}
