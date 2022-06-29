import java.util.*;
import java.util.stream.Collectors;

public class Blog {

    private ArrayList<Post> listaPosts;

    public Blog() {
        this.listaPosts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        listaPosts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> listaAutores = new TreeSet<>();

        for(Post s : listaPosts) {
            listaAutores.add(s.getAutor());
        }

        return listaAutores;

    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> mapa = new TreeMap<>();
        for(Post s : listaPosts) {
            if(mapa.containsKey(s.getCategoria())) {
                mapa.put(s.getCategoria(),mapa.get(s.getCategoria()) + 1);
            }else {
                mapa.put(s.getCategoria(),1);
            }
        }

        return mapa;
    }
}