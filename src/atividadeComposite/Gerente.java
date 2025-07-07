package atividadeComposite;

import java.util.ArrayList;

public class Gerente implements Usuario{
   private String nome = "NomeVazio";
   ArrayList<Usuario> usuarios = new ArrayList<>();

   public Gerente(String nome){
       this.nome = nome;
   }


    @Override
    public void falar() {
        System.out.println("Gerente: " + nome);
        for(Usuario usuario : usuarios){
            usuario.falar();
        }

    }

    public void adicionar(Usuario usuario){
       usuarios.add(usuario);
    }
}
