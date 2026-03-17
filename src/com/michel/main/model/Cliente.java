package com.michel.main.model;

public class Cliente {
    private String nome;
    private int idade;
    private Conta conta;

    public Cliente () {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "com.michel.main.model.Cliente " + "\n" +
                "Nome: " + nome;
    }
}




