package atividadeAdapter;

public class OldPagamento implements OldInterfacePagamento {

    @Override
    public void oldPagamento(Double pagamento) {
        System.out.println("Pagamento realizado: "+ pagamento);
    }
}
