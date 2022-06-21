import java.util.Locale;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException {
        if(largura<0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }

        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if(largura<0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }

        this.altura = altura;
    }

    @Override
    public double area() {
        return (getAltura() * getLargura());
    }

    public String toString() {
        String str = String.format(Locale.US,"[Retangulo] %.2f / %.2f \n",getLargura(),getAltura());
        return str;
    }

}