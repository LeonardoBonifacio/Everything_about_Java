package exercises.aulas_herança.atividade9;

public class MainArm {

    public static void main(String[] args) {
        Bota botasArcanas = new Bota("Botas Arcanas", 2, 15, 1500, 20);
        Luva luvasArcanas = new Luva("Luvas arcanas", 2, 10, 1300, 25);
        ArmPeito peitoralArcano = new ArmPeito("Peitoral Arcano", 3, 20, 2000, 400);
        Loja loja = new Loja();
        loja.setItens(peitoralArcano);
        loja.setItens(botasArcanas);
        loja.setItens(luvasArcanas);
        System.out.println("A quantidade de itens dentro da loa é de : " +  loja.mostraQuantidadeItens());
        System.out.println("O nome dos itens desta loja é: ");
        loja.mostraNomeDosItens();
        loja.mostraValorNomeItemMaisCaro();
    }

}
