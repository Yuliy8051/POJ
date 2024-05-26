import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz słowo:");
        Scanner scanner = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils(scanner.nextLine());
        System.out.println("Wybierz operację:");
        System.out.println("1. odwracanie stringów");
        System.out.println("2. szyfrowanie stringów za pomocą szyfru Cezara ");
        System.out.println("3. zamiana stringa na małe litery");
        System.out.println("4. zamiana stringa na duże litery");
        int operation = scanner.nextInt();
        switch (operation){
            case 1:
                System.out.println(stringUtils.odwracanie());
                break;
            case 2:
                System.out.println("O ile chcesz przesuniecie?");
                int a = scanner.nextInt();
                System.out.println(stringUtils.szyfrowanie(a));
                break;
            case 3:
                System.out.println(stringUtils.naMniejsze());
                break;
            case 4:
                System.out.println(stringUtils.naWieksze());
                break;
        }
    }
}