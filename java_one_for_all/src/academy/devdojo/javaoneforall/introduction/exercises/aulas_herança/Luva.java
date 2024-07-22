package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class Luva extends Armadura{
    private int atkSpeed;

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }

    public Luva(String nome, int level, int defesa) {
        super(nome, level, defesa);
    }

    public String toString() {
        return "Luva [atkSpeed=" + atkSpeed + ", getNome()=" + getNome() + ", getLevel()=" + getLevel() + ", getDefesa()=" +"]";
    }


}
