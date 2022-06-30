import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valInicial) {
        return clientes.add(new Cliente(nomeCliente,valInicial));
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valTrans) {
        for(Cliente cliente : clientes) {
            if(cliente.getNome().equals(nomeCliente)) {
                cliente.adicionarTransacao(valTrans);
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCliente) {
        return clientes.stream().filter(cliente -> cliente.getNome().equals(nomeCliente)).findFirst().orElse(null);
    }


}
