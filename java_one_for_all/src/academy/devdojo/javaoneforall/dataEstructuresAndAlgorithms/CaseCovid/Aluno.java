package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms.CaseCovid;

public class Aluno {
    private String name;
    int idade;
    boolean pegouCovid;
    int vezesQuePegouCovid;

    public Aluno(String name, int idade, boolean pegouCovid, int vezesQuePegouCovid) {
        this.name = name;
        this.idade = idade;
        this.pegouCovid = pegouCovid;
        this.vezesQuePegouCovid = vezesQuePegouCovid;
    }

    public Aluno() {

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPegouCovid(boolean pegouCovid) {
        this.pegouCovid = pegouCovid;
    }

    public void setVezesQuePegouCovid(int vezesQuePegouCovid) {
        this.vezesQuePegouCovid = vezesQuePegouCovid;
    }

    public boolean isPegouCovid() {
        return pegouCovid;
    }

    public int getVezesQuePegouCovid() {
        return vezesQuePegouCovid;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

}
