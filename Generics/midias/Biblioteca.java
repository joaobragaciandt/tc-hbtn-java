import java.util.ArrayList;

public class Biblioteca <T extends  Midia> {

    private ArrayList<T> listaMidias;

    public Biblioteca() {
        listaMidias = new ArrayList<>();
    }

    public void adicionarMidia(T livro1) {
        listaMidias.add(livro1);
    }

    public ArrayList<String> obterListaMidias() {
        ArrayList<String> lista = new ArrayList<>();
        listaMidias.forEach(midia -> {
            lista.add(midia.toString());
        });
        return lista;
    }
}
