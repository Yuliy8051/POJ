import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(compare(num1, num2));
    }

    public static int compare (int num1, int num2) {
        if (num1 == num2) return 0;
        else if (num1 < num2) return 1;
        else return -1;
    }
}