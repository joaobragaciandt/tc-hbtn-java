import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Blog {

    private List<Post> listaPosts;

    public Blog() {
        this.listaPosts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) throws IllegalArgumentException {
        for(Post p: listaPosts) {
            if(p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo()) ) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
            listaPosts.add(post);

    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> listaAutores = new TreeSet<>(
                Comparator.comparing(Autor::toString));

        for(Post s : listaPosts) {
            listaAutores.add(s.getAutor());
        }

        return listaAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> mapa = new TreeMap<>();
        for(Post s : listaPosts) {
            if(mapa.containsKey(s.getCategoria())) {
                mapa.put(s.getCategoria(),mapa.get(s.getCategoria()) + 1);
            }else {
                mapa.put(s.getCategoria(),1);
            }
        }

        return mapa;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {

        Set<Post> listaPostsCategoria = new TreeSet<>();

        for(Post p : listaPosts) {
            if(p.getCategoria().equals(categoria)) {
                listaPostsCategoria.add(p);
            }
        }

        return listaPostsCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {

        Set<Post> listapostsAutor = new TreeSet<>();

        for(Post p : listaPosts) {
            if(p.getAutor().equals(autor)) {
                listapostsAutor.add(p);
            }
        }

        return listapostsAutor;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {

        Map<Categorias,Set<Post>> mapCategorias = new TreeMap();

        for(Post p : listaPosts) {
            Set<Post> set;
            if(mapCategorias.containsKey(p.getCategoria())) {
                set = mapCategorias.get(p.getCategoria());
            }else {
                set = new TreeSet();
            }
            set.add(p);
            mapCategorias.put(p.getCategoria(),set);
        }

        return mapCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor,Set<Post>> mapAutores = new TreeMap();

        for(Post p : listaPosts) {
            Set<Post> set;
            if(mapAutores.containsKey(p.getAutor())) {
                set = mapAutores.get(p.getAutor());
            }else {
                set = new TreeSet();
            }
            set.add(p);
            mapAutores.put(p.getAutor(),set);
        }

        return mapAutores;
    }
}