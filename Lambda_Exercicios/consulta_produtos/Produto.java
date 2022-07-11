public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return (this.nome + " " + String.format("%.6f",this.preco) + " " + String.format("%.6f",this.peso) + " " +
               this.quantidadeEmEstoque + " " + this.tipo);
    }
}