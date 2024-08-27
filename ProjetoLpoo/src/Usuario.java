import java.util.Date;

public abstract class Usuario {
    private long id;
    private String nome;
    private long cpf;
    private long rg;
    private Date dataNascimento;
    private Endereco endereco;
    private Login login;
    private String telefone;
    private boolean moderador;
    
    public Usuario(long id, String nome, long cpf, long rg, Date dataNascimento, Endereco endereco, Login login,
            String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.login = login;
        this.telefone = telefone;
        this.moderador = false;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Login getLogin() {
        return login;
    }

    public String getTelefone() {
        return telefone;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
    
}