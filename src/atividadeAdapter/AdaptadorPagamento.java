package atividadeAdapter;

public class AdaptadorPagamento {

    OldPagamento oldPagamento = new OldPagamento();

    public void pagar(Double pagamento) {
        oldPagamento.oldPagamento(pagamento);
    }
}
