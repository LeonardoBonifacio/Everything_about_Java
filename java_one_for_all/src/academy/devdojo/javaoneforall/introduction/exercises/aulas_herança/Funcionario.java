package academy.devdojo.javaoneforall.introduction.exercises.aulas_herança;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void aumentarSalario(int valorDoAumento){
        System.out.println("O salário anterior era de R$" + this.salario);
        this.salario += valorDoAumento;

        System.out.println("O salário atual apos o aumento é de R$" + this.salario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
