import java.util.Date;

public class Admin extends Usuario {


    public Admin(long id, String nome, long cpf, long rg, Date dataNascimento, Endereco endereco, Login login,
            String telefone) {
        super(id, nome, cpf, rg, dataNascimento, endereco, login, telefone);
    }
    
    public void criarUsuario(Usuario usuario) {
        
    }
}