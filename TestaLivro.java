class Livro {
    private String TITULO;
    private String AUTOR;
    private int ANO;
    private String EDITORA;

    public Livro(String TITULO, String AUTOR, int ANO, String EDITORA) {
        this.TITULO = TITULO;
        this.AUTOR = AUTOR;
        this.ANO = ANO;
        this.EDITORA = EDITORA;
    }


    public String getTITULO() {
        return TITULO;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public int getANO() {
        return ANO;
    }

    public String getEDITORA() {
        return EDITORA;
    }


    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    public void setANO(int ANO) {
        this.ANO = ANO;
    }

    public void setEDITORA(String EDITORA) {
        this.EDITORA = EDITORA;
    }
}

public class TestaLivro {
    public static void main(String[] args) {
        Livro MAIS_VENDIDO1 = new Livro("Pré-Escrita - Coleção Aprenda em Casa", "Vários Autores", 2015, "TodoLivro");
        Livro MAIS_VENDIDO2 = new Livro("Aprenda em Casa Caligrafia: Coordenação Motor", "Desconhecido", 2021, "TodoLivro");
        Livro MAIS_VENDIDO3 = new Livro("Fisher-Price - Kit Coleção Como é Bom", "Desconhecido", 2020, "Ciranda Cultural");

        String titulo1 = MAIS_VENDIDO1.getTITULO();
        String autor1 = MAIS_VENDIDO1.getAUTOR();
        int ano1 = MAIS_VENDIDO1.getANO();
        String editora1 = MAIS_VENDIDO1.getEDITORA();

        String titulo2 = MAIS_VENDIDO2.getTITULO();
        String autor2 = MAIS_VENDIDO2.getAUTOR();
        int ano2 = MAIS_VENDIDO2.getANO();
        String editora2 = MAIS_VENDIDO2.getEDITORA();

        String titulo3 = MAIS_VENDIDO3.getTITULO();
        String autor3 = MAIS_VENDIDO3.getAUTOR();
        int ano3 = MAIS_VENDIDO3.getANO();
        String editora3 = MAIS_VENDIDO3.getEDITORA();

        MAIS_VENDIDO1.setTITULO("Novo Título");
        MAIS_VENDIDO2.setANO(2025);

        System.out.println("Livro 1:\nTítulo:" + titulo1 + "\nAutor:" + autor1 + "\nAno:" + ano1 + "\nEditora:" + editora1);
        System.out.println("\nLivro 2:\nTítulo:" + titulo2 + "\nAutor:" + autor2 + "\nAno:" + ano2 + "\nEditora:" + editora2);
        System.out.println("\nLivro 3:\nTítulo:" + titulo3 + "\nAutor:" + autor3 + "\nAno:" + ano3 + "\nEditora:" + editora3);
    }
}
