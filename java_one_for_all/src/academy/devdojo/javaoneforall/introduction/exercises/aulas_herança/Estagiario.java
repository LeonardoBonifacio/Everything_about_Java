package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class Estagiario extends Funcionario{

    private int matricula;
    private int periodoContratoDias;
    private int tempoRestanteEstagio;

    public Estagiario(String nome, double salario, String cargo, int matricula, int periodoContratoDias) {
        super(nome, salario, cargo);
        this.matricula = matricula;
        this.periodoContratoDias = periodoContratoDias;
        this.tempoRestanteEstagio = periodoContratoDias;
    }

    public void tempoRestanteEstagio(){
        if (tempoRestanteEstagio > 0) {
            System.out.println("O tempo que falta para o estágio acabar é de: " + this.tempoRestanteEstagio + " dias");
            return;
        }
        System.out.println("O estágio ja terminou");
    }

    public void setPeriodoContratoDias(int periodoContratoDias) {
        this.periodoContratoDias = periodoContratoDias;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPeriodoContratoDias() {
        return periodoContratoDias;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estagiario [matricula=" + matricula + ", periodoContratoDias=" + periodoContratoDias
                + ", tempoRestanteEstagio=" + tempoRestanteEstagio + ", Nome=" + getNome() + ", Salario="
                + getSalario() + ",Cargo=" + getCargo() + "]";
    }

    
}
