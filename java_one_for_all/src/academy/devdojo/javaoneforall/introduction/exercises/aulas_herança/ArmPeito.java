package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class ArmPeito extends Armadura {
    
    private int vida;

    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }

    public ArmPeito(String nome, int level, int defesa) {
        super(nome, level, defesa);
    }
}
