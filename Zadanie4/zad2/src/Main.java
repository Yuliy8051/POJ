import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kwadrat kwadrat = new Kwadrat(scanner.nextInt());
        System.out.println(kwadrat.obwod(kwadrat.bok));
        System.out.println(kwadrat.pole(kwadrat.bok));
    }
}