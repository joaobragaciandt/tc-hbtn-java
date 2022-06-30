import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        return agencias.stream().filter(agencia -> nomeAgencia.equals(agencia.getNome())).findFirst().orElse(null);
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if(buscarAgencia(nomeAgencia) != null) {
            return false;
        }
        return agencias.add(new Agencia(nomeAgencia));
    }


    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);//buscarCliente(nomeCliente);
        if(agencia==null || agencia.buscarCliente(nomeCliente) != null) {
            return false;
        }
        return agencia.novoCliente(nomeCliente,transacaoInicial);
    }


    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);//buscarCliente(nomeCliente);
        if(agencia==null || agencia.buscarCliente(nomeCliente) == null) {
            return false;
        }

        return agencia.adicionarTransacaoCliente(nomeCliente,transacao);
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);//buscarCliente(nomeCliente);
        if(agencia==null) {
            return false;
        }

        for(Agencia agenciaT : agencias) {
            for(Cliente cliente : agenciaT.getClientes()){
                cliente.apresentaDados(imprimeTransacoes,agenciaT.getClientes().indexOf(cliente));
            }
        }
        return true;


    }
}