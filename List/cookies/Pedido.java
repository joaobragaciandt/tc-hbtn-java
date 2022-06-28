import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie novoPedido) {
        this.cookies.add(novoPedido);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for(PedidoCookie c : cookies) {
            totalCaixas += c.getQuantidadeCaixas();
        }

        return totalCaixas;
    }

    public int removerSabor(String saborRemovido) {
        Iterator<PedidoCookie> itr = this.cookies.iterator();
        int qtRemovidos=0;
        while(itr.hasNext()) {
            PedidoCookie c = itr.next();
            if(c.getSabor().equals(saborRemovido)) {
                itr.remove();
                qtRemovidos+= c.getQuantidadeCaixas();
            }
        }

        return qtRemovidos;
    }


}