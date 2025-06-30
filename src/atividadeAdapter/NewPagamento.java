package atividadeAdapter;

public class NewPagamento implements NewInterfacePagamento {

    @Override
    public void newPagamento(Double pagamento) {
        System.out.println("Pagamento realizado: " + pagamento);
    }
}
