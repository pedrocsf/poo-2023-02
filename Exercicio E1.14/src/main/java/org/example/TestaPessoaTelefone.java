package org.example;
import java.util.HashSet;
import java.util.Set;
public class TestaPessoaTelefone {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        Telefone telefone1 = new Telefone("123456789");
        Telefone telefone2 = new Telefone("987654321");
        Telefone telefone3 = new Telefone("555555555");
        Telefone telefone4 = new Telefone("999999999");
        Telefone telefone5 = new Telefone("111111111");

        pessoa.adicionarTelefone(telefone1);
        pessoa.adicionarTelefone(telefone2);
        pessoa.adicionarTelefone(telefone3);
        pessoa.adicionarTelefone(telefone4);
        pessoa.adicionarTelefone(telefone5);
        pessoa.adicionarTelefone(telefone1);

        Telefone telefoneInexistente = new Telefone("000000000");
        pessoa.removerTelefone(telefoneInexistente);
        pessoa.removerTelefone(telefone3);

        System.out.println(pessoa);
    }
}