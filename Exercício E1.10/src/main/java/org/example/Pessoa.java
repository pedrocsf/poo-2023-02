package org.example;

public class Pessoa {
    private String nome;
    private double salario;
    private int idade;
    private int numDependentes;

    public Pessoa(String nome, double salario, int idade, int numDependentes) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.numDependentes = numDependentes;
    }

    public double calculaImposto() {
        double imposto = 0;

        if (idade >= 65) {
            return imposto;
        } else {
            if (salario <= 1787.77) {
                imposto = 0;
            } else if (salario <= 2679.29) {
                imposto = (salario - 1787.77) * 0.075 + 134.08;
            } else if (salario <= 3572.43) {
                imposto = (salario - 2679.29) * 0.15 + 134.08;
            } else if (salario <= 4463.81) {
                imposto = (salario - 3572.43) * 0.225 + 335.03;
            } else {
                imposto = (salario - 4463.81) * 0.275 + 602.96;
            }

            imposto -= 179.71 * numDependentes;

            return imposto > 0 ? imposto : 0; // Retorna 0 se imposto for negativo
        }
    }

}
