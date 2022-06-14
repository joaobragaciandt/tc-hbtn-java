public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        if(quantidadeDeDano>=getSaudeAtual()) {
            setSaudeAtual(0);
        }
        else {
            setSaudeAtual(getSaudeAtual()-quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if(quantidadeDeCura + getSaudeAtual()>= 100) {
            setSaudeAtual(100);
        }
        else {
            setSaudeAtual(getSaudeAtual()+quantidadeDeCura);
        }
    }
}