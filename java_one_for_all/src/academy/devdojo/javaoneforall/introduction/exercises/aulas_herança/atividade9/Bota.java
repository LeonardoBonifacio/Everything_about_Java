package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança.atividade9;

public class Bota extends Armadura{
    private int moveSpeed;
    

    public Bota(String nome, int level, int defesa, double preco, int moveSpeed) {
        super(nome, level, defesa, preco);
        this.moveSpeed = moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

}
