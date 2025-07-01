package atividadeDecorator;

public class Main {

    public static void main(String[] args) {

//        Usuários do sistema podem escolher gerar relatórios com ou sem
//        cabeçalho, rodapé ou assinatura. Como permitir essa flexibilidade sem
//        criar várias classes diferentes para cada combinação?

//        Usei o padrão de design Decorator. Em vez de criar uma classe para
//        cada combinação (por exemplo, com cabeçalho e rodapé ou com assinatura
//        e rodapé), criei decoradores que podem ser "empilhados" dinamicamente,
//            permitindo adicionar cabeçalho, rodapé e assinatura conforme a
//        necessidade. Assim, posso combinar os elementos do relatório de forma
//        flexível e sem criar muitas classes.

        Relatorio relatorio = new RelatorioSimples();
        relatorio = new DecoradorComCabecario(relatorio);
        relatorio = new DecoradorComRodape(relatorio);
        relatorio = new DecoradorComAssinatura(relatorio);

        System.out.println("Relatorio finalizado! " + relatorio.gerar());
    }
}
