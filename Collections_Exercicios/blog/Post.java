public class Post {

    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getAutor() != null ? !getAutor().equals(post.getAutor()) : post.getAutor() != null) return false;
        if (titulo != null ? !titulo.equals(post.titulo) : post.titulo != null) return false;
        if (corpo != null ? !corpo.equals(post.corpo) : post.corpo != null) return false;
        return categoria != null ? categoria.equals(post.categoria) : post.categoria == null;
    }

    @Override
    public int hashCode() {
        int result = getAutor() != null ? getAutor().hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (corpo != null ? corpo.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        return result;
    }
}
