import java.util.Date;

public class Paciente extends Usuario {
    private String tipoSanguineo;
    private String alergias;
    private String comorbidade;
    private String medicamentos;
    private String historicoMedico;
    private String historicoFamiliar;
    
    public Paciente(long id, String nome, long cpf, long rg, Date dataNascimento, Endereco endereco, Login login,
            String telefone, String tipoSanguineo, String alergias, String comorbidade, String medicamentos,
            String historicoMedico, String historicoFamiliar) {
        super(id, nome, cpf, rg, dataNascimento, endereco, login, telefone);
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.comorbidade = comorbidade;
        this.medicamentos = medicamentos;
        this.historicoMedico = historicoMedico;
        this.historicoFamiliar = historicoFamiliar;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(String comorbidade) {
        this.comorbidade = comorbidade;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }
    
    
}