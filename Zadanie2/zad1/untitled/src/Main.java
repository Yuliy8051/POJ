import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Radius = scanner.nextDouble();
        double Square =  Math.pow(Radius, 2) * Math.PI;
        System.out.println(Square);
    }
}