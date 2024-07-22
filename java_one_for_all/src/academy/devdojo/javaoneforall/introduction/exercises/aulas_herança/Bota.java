package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class Bota extends Armadura{
    private int moveSpeed;

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public Bota(String nome, int level, int defesa) {
        super(nome, level, defesa);
    }
}
