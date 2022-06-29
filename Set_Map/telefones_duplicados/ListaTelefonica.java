import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class ListaTelefonica {

    HashMap<String, HashSet<Telefone>> telefoneMap;

    public ListaTelefonica() {
        telefoneMap = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) throws IllegalArgumentException {
        HashSet<Telefone> novaLista = new HashSet<>();
        for(HashSet<Telefone> tel : telefoneMap.values()) {
            if(tel.contains(telefone)) {//telefoneMap.containsValue().contains(telefone)
                if (telefoneMap.get(nome).contains(telefone)) {//
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                } else {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }


        novaLista.add(telefone);
        if(this.buscar(nome)== null) {
            telefoneMap.put(nome,novaLista);
        } else {

            telefoneMap.get(nome).add(telefone);
        }
        return novaLista;
    }

    public HashSet<Telefone> buscar(String nome) {
        return telefoneMap.get(nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaTelefonica that = (ListaTelefonica) o;
        return Objects.equals(telefoneMap, that.telefoneMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefoneMap);
    }
}
