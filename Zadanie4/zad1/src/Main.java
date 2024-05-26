import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random() * 10);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = (int)(Math.random() * 10);
        }
        int[] arr3 = SumOfArrays(arr1, arr2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] SumOfArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        if (arr1.length == arr2.length) {
            arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] + arr2[2];
            }
        }
        return arr3;
    }
}