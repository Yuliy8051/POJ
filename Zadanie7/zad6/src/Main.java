public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(3));
        System.out.println(calculator.calculate(3,2));
        System.out.println(calculator.calculate(3,5,6));
    }
}