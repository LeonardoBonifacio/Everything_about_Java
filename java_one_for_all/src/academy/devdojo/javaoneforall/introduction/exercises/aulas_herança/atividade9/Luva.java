package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança.atividade9;

public class Luva extends Armadura{
    private int atkSpeed;

    
    public Luva(String nome, int level, int defesa, double preco, int atkSpeed) {
        super(nome, level, defesa, preco);
        this.atkSpeed = atkSpeed;
    }

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }



}
