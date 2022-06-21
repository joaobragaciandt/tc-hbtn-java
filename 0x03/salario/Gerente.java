public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonusMeta = getSalarioFixo() * 0.2;
        double diferencaMeta = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
        if(departamento.alcancouMeta()) {
            return (bonusMeta + diferencaMeta);
        }
        return 0;

    }
}