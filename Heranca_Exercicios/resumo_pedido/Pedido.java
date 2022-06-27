import produtos.*;

public class Pedido {

    private int percentualDescontos;
    private ItemPedido[] itens;

    public Pedido(int percentualDescontos, ItemPedido[] itens) {
        this.percentualDescontos = percentualDescontos;
        this.itens = itens;
    }

    public double totalPorProduto(ItemPedido i) {
        return (i.getQuantidade() * i.getProduto().obterPrecoLiquido());
    }

    public double valorSemDesconto() {
        double valorTotal = 0;
        for(ItemPedido i : this.itens) {
            valorTotal = valorTotal + totalPorProduto(i);
        }
        return valorTotal;
    }

    public double calcularTotal() {
        double valorTotal = valorSemDesconto() - ( valorSemDesconto() * percentualDescontos/100);
        return valorTotal;
    }


    public int getPercentualDescontos() {
        return percentualDescontos;
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido i : this.itens) {
            Produto produto = i.getProduto();
            System.out.printf("Tipo: %s Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",produto.getClass().getSimpleName(),
                        produto.getTitulo(),produto.obterPrecoLiquido(),i.getQuantidade(),totalPorProduto(i));
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n",(this.getPercentualDescontos() * this.valorSemDesconto())/100);
        System.out.printf("TOTAL PRODUTOS: %.2f\n",this.valorSemDesconto());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n",this.calcularTotal());
        System.out.println("----------------------------");

    }
}