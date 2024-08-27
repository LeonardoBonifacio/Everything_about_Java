package exercises.aulas_herança.atividade9;

import java.util.ArrayList;


public class Loja {
    private ArrayList<Armadura> itens = new ArrayList();


    public void setItens(Armadura item) {
        this.itens.add(item);
    }

    public ArrayList<Armadura> getItens() {
        return itens;
    }

    public int mostraQuantidadeItens(){
        return this.itens.size();
    }

    public void mostraNomeDosItens(){
        for (Armadura armadura : itens) {
            System.out.println(armadura.getNome());
        }
    }

    public void mostraValorNomeItemMaisCaro(){
        String name = "";
        double valor = 0;
        for (Armadura armadura : itens) {
            if (armadura.getPreco() > valor){
                valor = armadura.getPreco();
                name = armadura.getNome();
            }
        }
        System.out.println("Item mais caro é: " + name + " Custando: " + valor);
    }


}
