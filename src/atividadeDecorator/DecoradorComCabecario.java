package atividadeDecorator;

public class DecoradorComCabecario implements Relatorio {
     Relatorio relatorio;

     public DecoradorComCabecario(Relatorio relatorio) {
         this.relatorio = relatorio;
     }

    public String gerar() {
         return this.relatorio.gerar() + " com cabeçalho";
     }
}
