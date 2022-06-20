import java.lang.ArithmeticException;

public class Numero {
    public static void dividir(int a, int b) {
        try {
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("nao eh possivel dividir por 0");
        } finally {
            System.out.print(a + " / " + b + " = " + a/b + "\n");
        }
    }
}