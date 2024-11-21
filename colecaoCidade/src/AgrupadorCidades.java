import java.util.*;

public class AgrupadorCidades {

    private Map<String, List<Cidade>> agrupamento;


    private Set<Cidade> conjuntoCidades;

    public AgrupadorCidades() {
        this.agrupamento = new HashMap<>();
        this.conjuntoCidades = new TreeSet<>(Comparator.comparing(Cidade::getNome).reversed());
    }

    public void adicionarCidade(String uf, String nome, boolean isCapital) {
        Cidade cidade = new Cidade(nome, isCapital);

        agrupamento.putIfAbsent(uf, new ArrayList<>());
        agrupamento.get(uf).add(cidade);

        conjuntoCidades.add(cidade);
    }

    // Estrutura 1:
    public void imprimirCidadesPorUFOrdenadas() {
        agrupamento.forEach((uf, cidades) -> {
            // Ordena a lista de cidades alfabeticamente
            cidades.sort(Comparator.comparing(Cidade::getNome));

            System.out.println("Cidades na UF " + uf + ":");
            for (Cidade cidade : cidades) {
                System.out.println(" - " + cidade.getNome());
            }
        });
    }

    // Estrutura 2:
    public void listarCidadesPorUF(String uf) {
        List<Cidade> cidades = agrupamento.getOrDefault(uf, Collections.emptyList());

        cidades.sort((c1, c2) -> {
            if (c1.isCapital() != c2.isCapital()) {
                return c1.isCapital() ? -1 : 1;
            }
            return c1.getNome().compareTo(c2.getNome());
        });

        System.out.println("Cidades em " + uf + ":");
        for (Cidade cidade : cidades) {
            System.out.println(cidade.getNome() + (cidade.isCapital() ? " (Capital)" : ""));
        }
    }

    // Estrutura 3:
    public void listarCidadesDecrescente() {
        System.out.println("Cidades em ordem alfabética decrescente:");
        for (Cidade cidade : conjuntoCidades) {
            System.out.println(cidade.getNome());
        }
    }

    public Map<String, List<Cidade>> getAgrupamento() {
        return Collections.unmodifiableMap(agrupamento);
    }
}

