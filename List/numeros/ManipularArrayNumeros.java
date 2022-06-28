import java.util.*;

public class ManipularArrayNumeros {

    public static Integer buscarPosicaoNumero(List<Integer> listaInteiros, int numero) {
        Iterator<Integer> itr = listaInteiros.iterator();

        while (itr.hasNext()) {
            int pos = 0;
            int i = itr.next();
            if (i == numero) {
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> listaInteiros, int numero) throws IllegalArgumentException {
        Integer retorno = buscarPosicaoNumero(listaInteiros, numero);
        if (retorno != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            listaInteiros.add(numero);
        }
    }

    public static void removerNumero(List<Integer> listaInteiros, int numero) throws IllegalArgumentException {
        Integer retorno = buscarPosicaoNumero(listaInteiros, numero);
        if (retorno == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        } else {
            listaInteiros.remove(Integer.valueOf(numero));
        }
    }

    public static void substituirNumero(List<Integer> listaInteiros, int numeroSubstituir, int numeroSubstituto) {
        Integer retorno = buscarPosicaoNumero(listaInteiros, numeroSubstituir);
        if (retorno == -1) {
            listaInteiros.add(numeroSubstituto);
        } else {
            listaInteiros.set(retorno, numeroSubstituto);
        }
    }
}