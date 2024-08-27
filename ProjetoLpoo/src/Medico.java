import java.util.Date;

public class Medico extends Usuario {
    private Especialidade especialidade;
    private String crm;
    
    public Medico(long id, String nome, long cpf, long rg, Date dataNascimento, Endereco endereco, Login login,
            String telefone, Especialidade especialidade, String crm) {
        super(id, nome, cpf, rg, dataNascimento, endereco, login, telefone);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
