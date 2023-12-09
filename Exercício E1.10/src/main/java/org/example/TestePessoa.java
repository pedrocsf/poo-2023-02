package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestePessoa {

    @Test
    public void testMenor65Salario1787() {
        Pessoa pessoa = new Pessoa("Joao", 1500, 30, 0);
        assertEquals(0, pessoa.calculaImposto(), 0.001);
    }

    @Test
    public void testMenor65Salario2679() {
        Pessoa pessoa = new Pessoa("Maria", 2500, 40, 2);
        assertEquals(0, pessoa.calculaImposto(), 0.001);
    }


    @Test
    public void testMaiorIgual65Salario1787() {
        Pessoa pessoa = new Pessoa("Antonio", 1500, 65, 1);
        assertEquals(0, pessoa.calculaImposto(), 0.001);
    }

}
