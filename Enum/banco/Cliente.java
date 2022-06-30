import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome,double primeiraTransacao) {
        this.nome = nome;
        transacoes = new ArrayList<>();
        transacoes.add(primeiraTransacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valTransacao) {
        transacoes.add(valTransacao);
    }

    public void apresentaDados(boolean imprimeTransacoes,int clientePos) {
        System.out.printf("Cliente: %s [%d]\n",getNome(),clientePos+1);
        if(imprimeTransacoes) {
            for (Double transacao : transacoes) {
                System.out.printf("  [%d] valor %.2f\n",transacoes.indexOf(transacao)+1,transacao);
            }
        }
    }
}
