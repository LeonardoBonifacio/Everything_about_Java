package academy.devdojo.javaoneforall.introduction.exercises.PersonagemArmado;

public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private int defesa;
    private int dano;
    private Arma arma;

    public Personagem(String nome, int nivel, int vida, int mana, int defesa, int dano) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.defesa = defesa;
        this.dano = dano;
    }

    public void printAll() {
        System.out.println();
        System.out.println("Este é um " + this.nome);
        System.out.println("Está no nível " + this.nivel);
        System.out.println("Atualmente tem " + this.vida + " pontos de vida");
        System.out.println("Atualmente tem " + this.mana + " pontos de mana");
        System.out.println("Possui " + this.defesa + " pontos em defesa");
        System.out.println("Ele da " + this.dano + " de dano por ataque");
        System.out.println();
    }

    public void evoluir() {
        System.out.println("Este " + this.nome + " evoluiu ");
        this.nivel += 1;
        this.vida += 30;
        this.mana += 18;
        this.defesa += 5;
        this.dano += 7;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println("Game over");
            System.out.println("O " + this.nome + " morreu");
        }
    }

    public void equiparArma(Arma arma) {
        if (this.arma != null && arma.getNome() != this.arma.getNome()) {
            this.dano -= this.arma.getDano();
        }
        this.setArma(arma);
        this.dano += arma.getDano();

    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getMana() {
        return mana;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDano() {
        return dano;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
