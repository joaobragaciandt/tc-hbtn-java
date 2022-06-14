public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(getSaudeAtual()>0) {
            this.status = "vivo";
        }
        else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.equals("") && nome != null) {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
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