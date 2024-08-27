package exercises.aulas_herança.atividade9;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int qtdPaginas;


    public Livro(String titulo, String autor, int ano, int qtdPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.qtdPaginas = qtdPaginas;
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


    public int getQtdPaginas() {
        return qtdPaginas;
    }


    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    

    
}
