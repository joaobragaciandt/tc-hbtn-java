import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<Item> implements Armazenavel<Item> {

    private Map<String, Item> itens;

    public Armazem() {
        itens = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, Item valor) {
        itens.put(nome,valor);
    }

    @Override
    public Item obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
