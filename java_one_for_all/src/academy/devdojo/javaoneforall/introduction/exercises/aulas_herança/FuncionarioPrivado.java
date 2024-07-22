package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class FuncionarioPrivado extends Funcionario {

    private int valorInss;
    private long telefone;

    public FuncionarioPrivado(String nome, double salario, String cargo, int valorInss, long telefone) {
        super(nome, salario, cargo);
        this.valorInss = valorInss;
        this.telefone = telefone;
    }

    public void setValorInss(int valorInss) {
        this.valorInss = valorInss;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getValorInss() {
        return valorInss;
    }

    public long getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "FuncionarioPrivado [valorInss=" + valorInss + ", telefone=" + telefone  + ", getNome()=" + getNome() + ", Salario="
                + getSalario() + ", getCargo()=" + getCargo() + "]";
    }

    

    
}
