public class Video {

    private String arquivo;
    private FormatoVideo formatoVideo;

    public Video(String arquivo, FormatoVideo formatoVideo) {
        this.arquivo = arquivo;
        this.formatoVideo = formatoVideo;
    }

    @Override
    public String toString() {
        return this.arquivo + " - " + this.formatoVideo + "\n";
    }
}
