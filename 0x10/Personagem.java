import humor.*;
import comida.*;

public class Personagem {
    private int pontosDeFelicidade;

    public Personagem() {
        this.pontosDeFelicidade = 0;
    }
    public Humor obterHumorAtual() {
        if(pontosDeFelicidade<-5) {
            return new Irritado();
        }
        if(pontosDeFelicidade>=-5 && pontosDeFelicidade<=0) {
            return new Triste();
        }
        if(pontosDeFelicidade>=1 && pontosDeFelicidade<=15) {
            return new Feliz();
        }
        else { //pontosDeFelicidade>15
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas) {
        for(Comida novaComida: comidas) {
            pontosDeFelicidade += novaComida.getPontosDeFelicidade();
        }

    }

    @Override
    public String toString() {

        Humor humoratual = obterHumorAtual();
        return pontosDeFelicidade +
                " - " + humoratual.getClass().getSimpleName();
    }
}