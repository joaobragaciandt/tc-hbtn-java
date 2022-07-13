import java.util.*;
import java.util.stream.Collectors;
//psvm create main
public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {

         TreeMap<String, TreeSet<Pessoa>> retorno = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));
        return retorno;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));

    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.flatMapping(
                                pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new)))
                );
    }
}

    /*Map<Integer, List<Integer>> map =list.stream()
    .collect(Collectors.groupingBy(
         Collection::size,
         Nikollectors.flatMapping(
             l -> l.stream().filter(i -> i % 2 == 0),
             Collectors.toList()
        )
    )
);*/

