import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {

        TreeMap<String, TreeSet<Pessoa>> retorno  = todasPessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,() -> new TreeMap<>(Comparator.reverseOrder()),toCollection(TreeSet::new)));
        return retorno;
    }
}

