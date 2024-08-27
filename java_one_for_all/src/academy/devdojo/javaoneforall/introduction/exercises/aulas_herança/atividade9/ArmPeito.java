package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança.atividade9;

public class ArmPeito extends Armadura {
    private int vida;
    
    public ArmPeito(String nome, int level, int defesa, double preco, int vida) {
        super(nome, level, defesa, preco);
        this.vida = vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

}
