package exercises.PersonagemArmado;

public class Arma {
    private String nome;
    private int dano;
    private int municao;

    public Arma(String nome, int dano, int municao) {
        this.nome = nome;
        this.dano = dano;
        this.municao = municao;
    }

    public void atirar() {
        if (this.municao > 0) {
            System.out.println("POW");
            this.municao--;
            return;
        }
        System.out.println("Sem munição suficiente");
    }

    public String getNome() {
        return nome;
    }

    public int getMunicao() {
        return this.municao;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Dano: " + this.dano + " Munição: " + this.municao;
    }
}
