public class Post{

    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getAutor() != null ? !getAutor().equals(post.getAutor()) : post.getAutor() != null) return false;
        if (getTitulo() != null ? !getTitulo().equals(post.getTitulo()) : post.getTitulo() != null) return false;
        if (corpo != null ? !corpo.equals(post.corpo) : post.corpo != null) return false;
        return getCategoria() == post.getCategoria();
    }

    @Override
    public int hashCode() {
        int result = getAutor() != null ? getAutor().hashCode() : 0;
        result = 31 * result + (getTitulo() != null ? getTitulo().hashCode() : 0);
        return result;
    }
}
