import java.text.DecimalFormat;
public class Comida {

    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        DecimalFormat dec = new DecimalFormat("#0.0000");
        return "[" + getNome() + "] " + getCalorias() + " R$ " + dec.format(getPreco());
    }
}
