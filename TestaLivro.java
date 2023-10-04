public class TestaLivro {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Pré-Escrita - Coleção Aprenda em Casa", "Desconhecido", 2015, "Todolivro");
        Livro livro2 = new Livro("Aprenda em Casa Caligrafia: Coordenação Motora", "Desconhecido", 2021, "Todolivro");
        Livro livro3 = new Livro("Perigoso!","Tim Warnes", 2014, "Ciranda Cultural");

        System.out.println("Livro 1:\n" + livro1.toString() + "\n");
        System.out.println("Livro 2:\n" + livro2.toString() + "\n");
        System.out.println("Livro 3:\n" + livro3.toString() + "\n");
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nEditora: " + editora;
    }
}
