package exercises.Empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private String profissao;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, String cpf, String profissao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, String profissao, double salario, Departamento departamento) {
        this(nome, cpf, profissao, salario);
        this.departamento = departamento;
    }

    public void printAll() {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Salário: " + this.salario);
        if (departamento != null) {
            System.out.println("Departamento: " + this.departamento.getNome());
        }
        System.out.println();
    }

    public void acrescentaRemuneracao() {
        if (this.departamento != null) {
            this.salario += this.salario * this.departamento.getRemuneracaoExtra();
            return;
        }
        System.out.println("Este funcionário( " + this.nome+ " ) não está em nenhum departamento, por isso não vai receber aumento de salário");
    }

    public double getSalario() {
        return this.salario;
    }

    public String getProfissão() {
        return this.profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public String getProfissao() {
        return this.profissao;
    }

}
