package exercises.aulas_herança;

public class Main {
    public static void main(String[] args) {
        FuncionarioPublico fpu = new FuncionarioPublico("Rengoku", 7000, "Defensor público", 37409416);
        FuncionarioPrivado fpr =  new FuncionarioPrivado("Luffy", 12000, "Juiz", 200, 982614526);
        Estagiario es = new Estagiario("Leonardo", 750, "Repositor", 20231646, 365);

        fpu.calcularMargemConsignado();
        System.out.println();
        System.out.println(fpu);
        System.out.println(fpr);
        System.out.println(es);
        System.out.println();
        fpu.aumentarSalario(1000);
        es.aumentarSalario(150);

        System.out.println(fpu);
        fpu.calcularMargemConsignado();

    }
}
