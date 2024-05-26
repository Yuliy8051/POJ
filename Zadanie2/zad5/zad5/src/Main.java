import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 9;
        int M = 9;
        String numN;
        String numM;
        int num1;
        int num2;
        boolean[][] array = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((int)(Math.random()*2) == 0) array[i][j] = false;
                else array[i][j] = true;
            }
        }
        Scanner scanner = new Scanner(System.in);
        while (true){
            numN = scanner.nextLine();
            numM = scanner.nextLine();
            if (Objects.equals(numM, "x") || Objects.equals(numN, "x")) break;
            num1 = Integer.parseInt(numN);
            num2 = Integer.parseInt(numM);
            if (!array[num1][num2]) System.out.println("Already reserved");
            else {
                array[num1][num2] = false;
                System.out.println("Reserved");
            }
        }
        System.out.print(' ');
        for (int i = 1; i < 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(i+1);
            for (int j = 0; j < 9; j++) {
                if (array[i][j]) System.out.print(" +");
                else System.out.print(" -");
            }
            System.out.println();
        }
    }
}