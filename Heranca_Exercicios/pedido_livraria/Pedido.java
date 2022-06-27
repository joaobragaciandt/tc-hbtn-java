import produtos.*;

public class Pedido {

    int percentualDescontos;
    ItemPedido[] itens;

    public Pedido(int percentualDescontos, ItemPedido[] itens) {
        this.percentualDescontos = percentualDescontos;
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotal= 0;
        for(ItemPedido i : this.itens) {
            valorTotal = valorTotal + (i.getQuantidade() * i.getProduto().obterPrecoLiquido());
        }
        valorTotal = valorTotal - (valorTotal * percentualDescontos/100);
        return valorTotal;
    }

}