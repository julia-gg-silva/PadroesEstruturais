package atividadeDecorator;

public class DecoradorComAssinatura implements Relatorio {
    Relatorio relatorio;

    public DecoradorComAssinatura(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return this.relatorio.gerar() + " com assinatura";
    }
}
