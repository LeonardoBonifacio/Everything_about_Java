package academy.devdojo.javaoneforall.introduction.exercises.Empresa;



public class EmpresaTest {
    public static void main(String[] args) {
        Departamento rh = new Departamento("Recursos Humanos", 0.10);
        Departamento marketing = new Departamento("Marketing", 0.15);
        Funcionario funcionario1 = new Funcionario("Otonofredo", "043.234.654-45", "Consultor de Marketing", 4000, marketing);
        Funcionario funcionario2 = new Funcionario("Julias", "063.582.952-62", "Analista de Recursos", 3500, rh);
        Funcionario funcionaria3 = new Funcionario("Jiminia", "672.924.658-12", "Zeladora", 3000);
        funcionario1.acrescentaRemuneracao();
        funcionario2.acrescentaRemuneracao();
        funcionaria3.acrescentaRemuneracao();
        funcionario1.printAll();
        funcionario2.printAll();
        funcionaria3.printAll();
    }
}
