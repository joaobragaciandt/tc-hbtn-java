import java.text.DecimalFormat;
public class Eletronico {

    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        DecimalFormat dec = new DecimalFormat("#0.000000");
        return "[" + getDescricao() + "] R$ " + dec.format(getValor());
    }
}
