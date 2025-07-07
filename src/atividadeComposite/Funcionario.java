package atividadeComposite;

import java.util.ArrayList;

public class Funcionario implements Usuario{
    private String nome = "NomeVazio";
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void falar() {
        System.out.println("Funcionario: " + this.nome);
        for(Usuario usuario : usuarios){
            usuario.falar();
        }
    }

    public void adicionar(Usuario usuario){
        usuarios.add(usuario);
    }
}
