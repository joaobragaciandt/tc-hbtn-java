public class Contato {
    private String nome;
    private String numeroTelefone;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numeroTelefone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.tipoNumero = tipoNumero;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }
}
