import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        while (num2 == 0) {
            System.out.println("Dividing into 0 is impossible!");
            num2 = scanner.nextDouble();
        }
        System.out.println(num1 / num2);
    }
}