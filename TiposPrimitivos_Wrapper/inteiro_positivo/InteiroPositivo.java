public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(Integer valor) throws Exception {
        ehPositivo(valor);
        this.valor = valor;
    }

    public InteiroPositivo(String valor) throws Exception  {
        ehPositivo(Integer.parseInt(valor));
        this.valor = Integer.parseInt(valor);
    }

    public Exception ehPositivo(Integer valor) throws Exception {
        if(valor<0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        return null;
    }

    public void setValor(Integer valor) throws Exception {
        ehPositivo(valor);
        this.valor = valor;
    }

    public Integer getValor() throws Exception{
        return this.valor;
    }

    public boolean ehPrimo() {
        if( valor == 1) {
            return false;
        }

        if(valor != 2 && valor%2 == 0) {
            return false;
        }

        for(int i=3;i<(valor/2); i+=2) {
            if(valor%i == 0){
                return false;
            }
        }

        return true;
    }

}
