package exercises.Empresa;

// a) Crie outra classe chamada de Departamento. O departamento representa os
// setores de uma empresa: Recursos Humanos, Marketing, Financeiro etc. Essa classe terá
// os atributos: - nome, - remuneracaoExtra (representa uma porcentagem de remuneração
// a ser acrescida no salário).
public class Departamento {
    private String nome;// recursos humanos - > 10%, marketing -> 15%, financeiro - > 20%
    private double remuneracaoExtra;// porcentagem

    public Departamento(String nome, double remuneracaoExtra) {
        this.nome = nome;
        this.remuneracaoExtra = remuneracaoExtra;
    }

    @Override
    public String toString() {
        return "Nome do Departamento: " + this.nome + " Remuneração extra: " + this.remuneracaoExtra;
    }

    public double getRemuneracaoExtra() {
        return remuneracaoExtra;
    }

    public String getNome() {
        return nome;
    }

}
