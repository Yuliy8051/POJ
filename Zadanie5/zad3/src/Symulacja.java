import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = scanner.nextInt();
        int orzel = 0;
        Moneta[] monety = new Moneta[tries];
        for (int i = 0; i < tries; i++) {
            monety[i] = new Moneta();
            if (monety[i].rzut() == Strona.ORZEL) orzel++;
        }
        System.out.println(100 * orzel / tries +  "% orzeł | " + (100 - 100 * orzel / tries) + "% reszka dla " + tries + " rutów");
    }
}
