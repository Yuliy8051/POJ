import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        MyCircle circle = new MyCircle(radius);
        System.out.println(circle.obwod(radius));
        System.out.println(circle.pole(radius));
        System.out.println(circle.srednica(radius));
    }
}