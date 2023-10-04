public class TestaLivro {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", 2003, "Doubleday");
        Livro livro2 = new Livro("Title of Book2", "Author of Book2", 2000, "Publisher2");
        Livro livro3 = new Livro("Title of Book3", "Author of Book3", 1995, "Publisher3");

        System.out.println("Livro 1:\n" + livro1.toString() + "\n");
        System.out.println("Livro 2:\n" + livro2.toString() + "\n");
        System.out.println("Livro 3:\n" + livro3.toString() + "\n");
    }
}