package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms.CaseCovid;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstudoCovid {
    static Queue<Aluno> filaAlunos = new LinkedList<>();
    static int totalEntrevistados = 0;
    static int qtdAlunosQNaoPegouCovid = 0;
    static int qtdAlunosQPegouCovidApenasUmaVez = 0;
    static int qtdAlunosQPegouCovidMaisDeUmaVez = 0;

    public static void main(String[] args) {

        recolhimentoDeDados();
        visualizarInformações();

    }

    public static void recolhimentoDeDados() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "---------------------------------------------------------------------------------------------------------");
            System.out.print(
                    "Por favor digite o Nome do Aluno ou 'SAIR' para parar de informar(continuara informando até digitar sair): ");
            String nomeAluno = input.next();
            if (nomeAluno.strip().equalsIgnoreCase("sair"))
                break;
            Aluno aluno = new Aluno();
            aluno.setName(nomeAluno);

            System.out.print("Por favor digite a Idade do Aluno: ");
            int idadeAluno = input.nextInt();
            aluno.setIdade(idadeAluno);

            System.out.print("Este aluno já pegou covid? S ou N: ");
            String jaPegou = input.next();
            if (jaPegou.strip().equalsIgnoreCase("S")) {
                System.out.print("Por favor digite quantas vezes este aluno pegou covid: ");
                int vezesQuePegouCovid = input.nextInt();
                aluno.setPegouCovid(true);
                aluno.setVezesQuePegouCovid(vezesQuePegouCovid);

            } else {
                aluno.setPegouCovid(false);
                aluno.setVezesQuePegouCovid(0);
            }
            filaAlunos.add(aluno);
            totalEntrevistados++;
            if (!aluno.isPegouCovid()) {
                qtdAlunosQNaoPegouCovid++;
            } else if (aluno.getVezesQuePegouCovid() == 1) {
                qtdAlunosQPegouCovidApenasUmaVez++;
            } else {
                qtdAlunosQPegouCovidMaisDeUmaVez++;
            }

            System.out.print("Deseja cadastrar mais algum aluno? S ou N: ");
            String resp = input.next();
            if (!resp.strip().equalsIgnoreCase("S")) {
                break;
            }
        }
        input.close();
    }

    public static void visualizarInformações() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Resultados do Estudo feito pelo Professor: ");
        System.out.println("Quantidade de Entrevistados: " + totalEntrevistados);
        System.out.println("Quantidade de alunos que não pegaram covid: " + qtdAlunosQNaoPegouCovid);
        System.out.println("Quantidade de alunos que pegaram covid apenas uma vez: " + qtdAlunosQPegouCovidApenasUmaVez);
        System.out.println("Quantidade de alunos que pegaram covid mais de uma vez: " + qtdAlunosQPegouCovidMaisDeUmaVez);
        if (filaAlunos.size() > 0) {
            System.out.println("Visualização completa sobre cada Aluno");
            for (Aluno aluno : filaAlunos) {
                System.out.println();
                System.out.println("Nome do(a) aluno(a): " + aluno.getName());
                System.out.println("Idade do(a) aluno(a): " + aluno.getIdade());
                System.out.println("Este aluno(a) pegou covid ? " + aluno.isPegouCovid());
                System.out
                        .println("Quantidade de vezes que este aluno(a) pegou covid: " + aluno.getVezesQuePegouCovid());
                System.out.println();
            }
        }
        System.out.println("----------------------------------------------------------------------------");

    }
}
