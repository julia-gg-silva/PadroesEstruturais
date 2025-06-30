package exemploSorvete;

public class CoberturaChocolate implements Sorvete {
    Sorvete sorvete;

    public CoberturaChocolate(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String servir() {
        return this.sorvete.servir() + " com cobertura de chocolate";
    }
}
