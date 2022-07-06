import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    public Produto(double preco,String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    Supplier<Double> precoComMarkup = () -> this.preco + (preco*percentualMarkup/100);

    Consumer<Double> atualizarMarkup = (Double modifica) -> percentualMarkup = modifica;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
