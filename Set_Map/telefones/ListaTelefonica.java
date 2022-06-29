import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    HashMap<String, ArrayList<Telefone>> telefoneMap;

    public ListaTelefonica() {
        telefoneMap = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if(this.buscar(nome)== null) {
            ArrayList<Telefone> novaLista = new ArrayList<>();
            novaLista.add(telefone);
            telefoneMap.put(nome,novaLista);

        } else {
            telefoneMap.get(nome).add(telefone);
        }

    }

    public ArrayList<Telefone> buscar(String nome) {
        return telefoneMap.get(nome);
    }


}
