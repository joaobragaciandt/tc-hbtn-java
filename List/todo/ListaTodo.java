import java.util.ArrayList;
import java.util.Iterator;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        Iterator<Tarefa> itr = this.tarefas.iterator();

        while(itr.hasNext()) {
            Tarefa t = itr.next();
            if(t.getIdentificador()==tarefa.getIdentificador()) {
                String msg  = new String("tarefa com identifcador "+ tarefa.getIdentificador() + " ja existente na lista");
                throw new IllegalArgumentException(msg);
            }
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int idTarefa) {
        Iterator<Tarefa> itr = this.tarefas.iterator();

        for(Tarefa t: tarefas) {
            if(t.getIdentificador() == idTarefa) {
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }
    public boolean desfazerTarefa(int idTarefa) {
        Iterator<Tarefa> itr = this.tarefas.iterator();

        for(Tarefa t: tarefas) {
            if(t.getIdentificador() == idTarefa) {
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for(Tarefa t: tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for(Tarefa t: tarefas) {
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        Iterator<Tarefa> itr = this.tarefas.iterator();

        while(itr.hasNext()) {
            Tarefa t = itr.next();
            if(t.isEstahFeita()){
                System.out.printf("[X]  ");
            } else {
                System.out.printf("[ ]  ");
            }
            System.out.printf("Id: %d - Descricao: %s\n",t.getIdentificador(),t.getDescricao());
        }
    }
//[X]  Id: 1 - Descricao: Tarefa 1
}