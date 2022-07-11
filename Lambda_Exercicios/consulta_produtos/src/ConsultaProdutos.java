package src;

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> listaProdutos, CriterioFiltro criterio) {
        List<Produto> listaFiltrada = new ArrayList<>();

        //return listaProdutos.stream().filter(criterio::teste).forEach();

        for(Produto p : listaProdutos) {
            if(criterio.teste(p)) {
                listaFiltrada.add(p);
            }
        }

        return listaFiltrada;
    }
}
