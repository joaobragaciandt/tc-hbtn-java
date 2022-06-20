import java.lang.ArithmeticException;

public class Numero {
    public static void dividir(int a, int b) {
        int c=0;
        try {
            c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("nao eh possivel dividir por 0");
            c= 0;
        } finally {
            System.out.println(a + " / " + b + " = " + c);
        }
    }
}