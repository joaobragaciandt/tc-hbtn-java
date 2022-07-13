import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {

    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> lista) {

        List<Estudante> arrayList = new ArrayList<>(lista);
        FileOutputStream fout = null;
        ObjectOutputStream obj = null;

        try {
            fout = new FileOutputStream(nomeArquivo);
            obj = new ObjectOutputStream(fout);

            obj.writeObject(arrayList);
            obj.close();
            fout.close();
        } catch (IOException ex ) {
            System.out.println("Nao foi possivel serializar");
        }

    }

    public List<Estudante> desserializar() {
        List<Estudante> lista;

        try {
            FileInputStream fout = new FileInputStream(nomeArquivo);
            ObjectInputStream obj = new ObjectInputStream(fout);
            lista = (List<Estudante>)obj.readObject();
            obj.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex ) {
            System.out.println("Nao foi possivel desserializar");
        }

        return null;
    }

}
