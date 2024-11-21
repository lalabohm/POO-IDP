import java.util.Objects;

public class Cidade {
    private String nome;
    private boolean isCapital;

    // Construtor
    public Cidade(String nome, boolean isCapital) {
        this.nome = nome;
        this.isCapital = isCapital;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public boolean isCapital() {
        return isCapital;
    }

    // Override de equals e hashCode para garantir unicidade no conjunto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return nome.equals(cidade.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
