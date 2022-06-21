import java.util.Locale;
public class Quadrado extends Retangulo{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException {
        if(lado<0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        super.setAltura(lado);
        super.setLargura(lado);
    }

    @Override
    public String toString() {
        String str = String.format(Locale.US,"[Quadrado] %.2f",getLado());
        return str;
    }
}