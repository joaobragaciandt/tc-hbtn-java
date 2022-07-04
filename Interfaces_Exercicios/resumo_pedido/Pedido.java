import provedores.Frete;

public class Pedido {

    private int codigo;
    private int peso;
    private double total;
    private Frete frete;

    public Pedido(int codigo, int peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public int getPeso() {
        return peso;
    }


    public Frete getFrete() {
        return frete;
    }

    public double getTotal() {
        return total;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
