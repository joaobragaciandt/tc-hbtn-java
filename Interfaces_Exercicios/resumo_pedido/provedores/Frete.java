package provedores;

public class Frete {

    private Double valor;
    private TipoProvedorFrete tipoProvedorFrete;


    public Frete() {
    }

    public Double getValor() {
        return valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
}
