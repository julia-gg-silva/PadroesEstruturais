package exemploComposite;

public class Main {
    public static void main(String[] args) {
        Pasta pastaRaiz = new Pasta("raiz");
        Arquivo redme = new Arquivo("redme.md");
        Pasta java = new Pasta("java");

        pastaRaiz.adicionar(redme);
        pastaRaiz.adicionar(java);

        java.adicionar(new Arquivo("Main.java"));
        java.adicionar(new Arquivo("ExemplosPastas.java"));

        redme.abrir();
    }
}
