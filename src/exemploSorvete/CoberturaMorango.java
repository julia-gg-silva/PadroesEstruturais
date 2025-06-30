package exemploSorvete;

public class CoberturaMorango implements Sorvete {
    Sorvete sorvete;

    public CoberturaMorango(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public String servir() {
        return this.sorvete.servir() + " com cobertura de morango";
    }
}
