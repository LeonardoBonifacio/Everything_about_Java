package exercises.aulas_herança.atividade9;

public abstract class Armadura {

    private String nome;
    private int level;
    private int defesa;
    private double preco;


    public Armadura(String nome, int level, int defesa, double preco) {
        this.nome = nome;
        this.level = level;
        this.defesa = defesa;
        this.preco = preco;
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

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }


}
