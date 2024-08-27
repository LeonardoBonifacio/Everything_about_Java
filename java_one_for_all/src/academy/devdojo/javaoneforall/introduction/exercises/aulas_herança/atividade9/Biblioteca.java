package exercises.aulas_herança.atividade9;

import java.util.ArrayList;

public class Biblioteca {
    private String nomeDaBiblioteca;
    private ArrayList<Livro> listaLivros = new ArrayList<>();



    public Biblioteca(String nomeDaBiblioteca, ArrayList<Livro> listaLivros) {
        this.nomeDaBiblioteca = nomeDaBiblioteca;
        this.listaLivros = listaLivros;
    }



    public Biblioteca(String nomeDaBiblioteca) {
        this.nomeDaBiblioteca = nomeDaBiblioteca;
    }



    public String getNomeDaBiblioteca() {
        return nomeDaBiblioteca;
    }



    public void setNomeDaBiblioteca(String nomeDaBiblioteca) {
        this.nomeDaBiblioteca = nomeDaBiblioteca;
    }



    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }



    public void setLivro(Livro livro) {
        this.listaLivros.add(livro);
    }

    public int mostraQuantidadeLivros(){
        return this.listaLivros.size();
    }

    public void mostraQuantidadeTotalPaginas(){
        int totalPaginas = 0;
        for (Livro livro : listaLivros) {
            totalPaginas += livro.getQtdPaginas();
        }
        System.out.println("A quantidade total de páginas disponiveis nesta biblioteca é de: " + totalPaginas);
    }


    


    
}
