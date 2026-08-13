public class Calculator {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 10;
        System.out.println("/ " + divide(num2,num1));
    }
    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double divide(double a, double b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception: likely divided by 0");
            return 0.0;
        }
    }

    public static double multiply(double a, double b) {
        return a*b;
    }
}