package org.example;
import java.util.HashSet;
import java.util.Set;
class Pessoa {
    private String nome;
    private Set<Telefone> telefones;
    public Pessoa(String nome) {
        this.nome = nome;
        this.telefones = new HashSet<>();
    }
    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }
    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Nome: " + nome + "\nTelefones: ");
        for (Telefone telefone : telefones) {
            result.append(telefone.getNumero()).append(", ");
        }
        if (!telefones.isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }
        return result.toString();
    }
}
