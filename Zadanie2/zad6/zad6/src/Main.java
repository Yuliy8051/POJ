import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(Fibonacci(a));
    }

    public static int Fibonacci (int a) {
        if (a == 0) return 0;
        else if (0 < a && a < 3) return 1;
        else return Fibonacci(a-1) + Fibonacci(a-2);
    }
}