public class TestaLivro {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.setTitulo("Pré-Escrita - Coleção Aprenda em Casa");
        livro1.setAutor("Desconhecido");
        livro1.setAno(2015);
        livro1.setEditora("Todolivro");
        
        Livro livro2 = new Livro();
        livro2.setTitulo("Aprenda em Casa Caligrafia: Coordenação Motora");
        livro2.setAutor("Desconhecido");
        livro2.setAno(2021);
        livro2.setEditora("Todolivro");
        
        Livro livro3 = new Livro();
        livro3.setTitulo("Perigoso!");
        livro3.setAutor("Tim Warnes");
        livro3.setAno(2014);
        livro3.setEditora("Ciranda Cultural");

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAno());
        System.out.println("Editora: " + livro1.getEditora() + "\n");

        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano: " + livro2.getAno());
        System.out.println("Editora: " + livro2.getEditora() + "\n");

        System.out.println("Livro 3:");
        System.out.println("Título: " + livro3.getTitulo());
        System.out.println("Autor: " + livro3.getAutor());
        System.out.println("Ano: " + livro3.getAno());
        System.out.println("Editora: " + livro3.getEditora() + "\n");
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;





    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }




    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }
}
