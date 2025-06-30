package atividadeDecorator;

public class Main {

    public static void main(String[] args) {

        Relatorio relatorio = new RelatorioSimples();
        relatorio = new DecoradorComCabecario(relatorio);
        relatorio = new DecoradorComRodape(relatorio);
        relatorio = new DecoradorComAssinatura(relatorio);

        System.out.println("Relatorio finalizado! " + relatorio.gerar());
    }
}
