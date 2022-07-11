import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listaProdutos, Predicate<Produto> criterio) {
        List<Produto> listaFiltrada = new ArrayList<>();

        //return listaProdutos.stream().filter(criterio::teste).forEach();

        for(Produto p : listaProdutos) {
            if(criterio.test(p)) {
                listaFiltrada.add(p);
            }
        }

        return listaFiltrada;
    }
}
