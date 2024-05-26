import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = scanner.nextInt();
        }
        for (int i = N-1; i >= 0; i--) {
            System.out.print(Array[i] + "\t");
        }
    }
}