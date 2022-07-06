import java.util.Map;
import java.util.TreeMap;

public class ArmazemDeEletronico extends Armazem{

    private Map<String, Eletronico> Eletronicos;

    public ArmazemDeEletronico() {
        Eletronicos = new TreeMap<>();
    }

    public void adicionarAoInventario(String nome, Eletronico valor) {
        Eletronicos.put(nome,valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return Eletronicos.get(nome);
    }
}
