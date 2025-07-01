package exemploComposite;

import java.util.ArrayList;

public class Pasta implements Documento {
    private String nome = "<nome vazio>";
    ArrayList<Documento> documentos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void abrir() {
        System.out.println("Pasta: " + this.nome);
        for (Documento documento : documentos) {
            documento.abrir();
        }
    }

    public void adicionar(Documento documento) {
        documentos.add(documento);
    }
}
