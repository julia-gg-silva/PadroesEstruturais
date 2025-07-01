package exemploComposite;

public class Arquivo implements Documento {
    private String nome = "<nome vazio>";

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public void abrir() {
        System.out.println("Arquivo: " + this.nome);
    }
}
