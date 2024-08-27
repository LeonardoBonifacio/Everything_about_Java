package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança.atividade9;

public class MainBiblio {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Luvre");
        Livro pedraFilosofal = new Livro("Harry Potter e a pedra filosofal", "J.K.ROWLING", 1997, 317);
        Livro duna = new Livro("Duna", "Frank Herbert", 1965, 843);
        Livro Hobbit = new Livro("O hobbit", "J. R. R. Tolkien", 1937, 328);
        
        biblioteca.setLivro(Hobbit);
        biblioteca.setLivro(pedraFilosofal);
        biblioteca.setLivro(duna);
        System.out.println("A quantidade de livros nessa biblioteca é de: " + biblioteca.mostraQuantidadeLivros());
        for (Livro livro : biblioteca.getListaLivros()) {
            System.out.println("Livro: " + livro.getTitulo());
        }

        biblioteca.mostraQuantidadeTotalPaginas();
    }

}
