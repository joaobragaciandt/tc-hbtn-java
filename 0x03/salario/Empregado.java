public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if(departamento.alcancouMeta()) {
            return (getSalarioFixo() * 0.1);
        }
        return 0;

    }

    double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}