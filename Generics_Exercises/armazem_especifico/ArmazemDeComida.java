import java.util.Map;
import java.util.TreeMap;

public class ArmazemDeComida extends Armazem{

    private Map<String, Comida> listaComidas;

    public ArmazemDeComida() {
        listaComidas = new TreeMap<>();
    }
    public void adicionarAoInventario(String nome, Comida valor) {
        listaComidas.put(nome,valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return listaComidas.get(nome);
    }
}
