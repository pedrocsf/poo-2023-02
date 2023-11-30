package org.example;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double calculaImposto() {
        double imposto = 0;

        if (idade < 65) {
            if (salario <= 2000) {
                imposto = salario * 0.1;
            } else {
                imposto = salario * 0.15;
            }
        } else {
            if (salario <= 2000) {
                imposto = salario * 0.08;
            } else {
                imposto = salario * 0.12;
            }
        }

        return imposto;
    }

}

