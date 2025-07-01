package atividadeAdapter;

public class Main {

//    Você precisa integrar um sistema de pagamento antigo com uma
//    nova API moderna. As interfaces são diferentes. Como você faria
//    para reaproveitar o código antigo sem alterar sua estrutura?

//    Eu usei o padrão de design Adapter. Criei uma classe adaptadora (AdaptadorPagamento)
//    que permite que a nova aplicação utilize o código do sistema de pagamento antigo sem
//    precisar modificar a classe OldPagamento.

    public static void main(String[] args) {
    AdaptadorPagamento pagamento = new AdaptadorPagamento();
    pagamento.pagar(9.000);

    }
}
