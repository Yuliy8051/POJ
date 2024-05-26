import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        if (sum % 5 == 0) System.out.println("true");
        else System.out.println("false");
    }
}