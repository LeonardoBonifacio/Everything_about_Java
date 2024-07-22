package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public class FuncionarioPublico extends Funcionario{
    
    private int siap;

    public FuncionarioPublico(String nome, double salario, String cargo, int siap) {
        super(nome, salario, cargo);
        this.siap = siap;
    }

    public void calcularMargemConsignado(){
        System.out.println("O valor da margem para empréstimo consignado é de R$" + getSalario() * 0.35f);
        System.out.println();
    }

    public void setSiap(int siap) {
        this.siap = siap;
    }

    public int getSiap() {
        return siap;
    }

    @Override
    public String toString() {
        return "FuncionarioPublico [siap=" + siap + ", Siap=" + getSiap() + ", Nome=" + getNome()
                + ", Salario=" + getSalario() + ", Cargo=" + getCargo() + "]";
    }

    


}
