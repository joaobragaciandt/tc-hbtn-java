public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void apresentar() {
        System.out.printf("Codigo: %d\n",getCodigo());
        System.out.printf("Nome: %s\n",getNome());
        System.out.printf("Bairro: %s\n",getEndereco().getBairro());
        System.out.printf("Cidade: %s\n",getEndereco().getCidade());
        System.out.printf("Pais: %s",getEndereco().getPais());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}