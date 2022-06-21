import exceptions.*;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor>0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor<=0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else {
            if(valor>getSaldo()) {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            } else {
                this.saldo -= valor;
            }
        }
    }

    public double calcularTarifaMensal() {
        double taxaPorcentagem = getSaldo()*0.1;
        if(taxaPorcentagem<10.0) {
            return taxaPorcentagem;
        } else {
            return 10.0;
        }
    }

    public double calcularJurosMensal() {
        if(getSaldo()< 0) {
            return 0;
        }else {
            double jurosEmPorcentagem = (getTaxaJurosAnual()/12)/100;
            double valorReal =  getSaldo()*jurosEmPorcentagem;
            return valorReal;
        }
    }

    public void aplicarAtualizacaoMensal() {
        double valorJuros = calcularJurosMensal();
        double valorTarifa = calcularTarifaMensal();
        this.saldo += valorJuros;
        this.saldo -= valorTarifa;

    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void taxaBanco(double valor) {
        this.saldo -=valor;
    }
}