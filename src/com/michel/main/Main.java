package com.michel.main;

import com.michel.main.model.Cliente;
import com.michel.main.model.Conta;
import com.michel.main.service.GerenciadorFinanceiro;

import java.util.Scanner;

public class Main {
    static void main() {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        GerenciadorFinanceiro gerenciadorFinanceiro = new GerenciadorFinanceiro(conta);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println("Agencia: ");
        conta.setAgencia(sc.nextInt());

        System.out.println("com.michel.main.model.Conta: ");
        conta.setNumeroConta(sc.nextInt());

        System.out.println(cliente);
        System.out.println(conta);

        int opcao;

        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quanto Deseja Depositar: ");
                    gerenciadorFinanceiro.depositar(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Quanto Deseja Sacar: ");
                    gerenciadorFinanceiro.sacar(sc.nextDouble());
                    break;
                case 3:
                    gerenciadorFinanceiro.mostrarSaldo();
            }

        } while (opcao != 0);

        sc.close();






    }

}
