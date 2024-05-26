import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Punkt punkt0 = new Punkt();
        Punkt punky1 = new Punkt(x, y);
        System.out.println(punkt0.odleglosc1(x, y));
        System.out.println(punkt0.odleglosc2(punky1));
    }
}