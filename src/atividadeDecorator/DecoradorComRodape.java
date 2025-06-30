package atividadeDecorator;

public class DecoradorComRodape implements Relatorio {
    Relatorio relatorio;

    public DecoradorComRodape(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + " com rodapé";
    }
}
