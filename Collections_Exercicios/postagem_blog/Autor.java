public class Autor implements Comparable {

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return  nome + " " + sobrenome ;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo((o).toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;

        Autor autor = (Autor) o;

        if (getNome() != null ? !getNome().equals(autor.getNome()) : autor.getNome() != null) return false;
        return getSobrenome() != null ? getSobrenome().equals(autor.getSobrenome()) : autor.getSobrenome() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getSobrenome() != null ? getSobrenome().hashCode() : 0);
        return result;
    }
}
