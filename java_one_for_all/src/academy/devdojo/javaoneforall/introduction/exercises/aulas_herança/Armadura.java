package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public abstract class Armadura {

    private String nome;
    private int level;
    private int defesa;

    public Armadura(String nome, int level, int defesa) {
        this.nome = nome;
        this.level = level;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

}
