import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        canais.forEach(canal ->
                canal.notificar(new Mensagem(video.toString(),TipoMensagem.LOG)));
    }


}
