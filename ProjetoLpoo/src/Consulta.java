import java.util.Date;

public class Consulta {
    private long idConsulta;
    private long idPaciente;
    private long idMedico;
    private Status statusPaciente;
    private float valorConsulta;
    private int numeroConsulta;
    private Date dataConsulta;
    private String exercicios;
    
    public Consulta(long idConsulta, long idPaciente, long idMedico, Status statusPaciente, float valorConsulta,
            int numeroConsulta, Date dataConsulta, String exercicios) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.statusPaciente = statusPaciente;
        this.valorConsulta = valorConsulta;
        this.numeroConsulta = numeroConsulta;
        this.dataConsulta = dataConsulta;
        this.exercicios = exercicios;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public Status getStatusPaciente() {
        return statusPaciente;
    }

    public void setStatusPaciente(Status statusPaciente) {
        this.statusPaciente = statusPaciente;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getExercicios() {
        return exercicios;
    }

    public void setExercicios(String exercicios) {
        this.exercicios = exercicios;
    }
}