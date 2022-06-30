import java.sql.Connection;
import java.util.ArrayList;
import java.util.Objects;

public class Celular {

    private ArrayList<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nomeContato) {//usar indexOf

        Contato buscarContato;
        try {
            buscarContato = contatos.stream().filter(buscarCont -> nomeContato.equals(buscarCont.getNome())).findFirst().get();
        } catch (Exception ex) {
            return -1;
        }

        return contatos.indexOf(buscarContato);
    }
    public void adicionarContato(Contato contato1) throws IllegalArgumentException {
        if(obterPosicaoContato(contato1.getNome()) < -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        contatos.add(contato1);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws IllegalArgumentException {
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if(obterPosicaoContato(novoContato.getNome()) != -1 && (!Objects.equals(contatoAntigo.getNome(), novoContato.getNome()))) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(obterPosicaoContato(contatoAntigo.getNome()),novoContato);

    }

    public void removerContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        contatos.remove(obterPosicaoContato(contato.getNome()));
    }

    public void listarContatos() {
        contatos.forEach(contato -> System.out.print(contato.getNome()+ " -> " + contato.getNumeroTelefone() + " (" +
                contato.getTipoNumero().name() + ")\n"));
    }

    /*Jane Doe -> 998211555 (CELULAR)
      John Bannons -> 32214332 (CASA)*/
}