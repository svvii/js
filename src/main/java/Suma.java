package calculadora;

public class Suma {
    public static Object sumar(Object a, Object b) {
        try {
            double num1 = Double.parseDouble(a.toString());
            double num2 = Double.parseDouble(b.toString());
            return num1 + num2;
        } catch (NumberFormatException e) {
            return "Error";
        }
    }
}
