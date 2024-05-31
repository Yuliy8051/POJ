import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> losoweLiczby = new HashSet<>();
        while (losoweLiczby.size() < 6){
            losoweLiczby.add((int)(Math.random()*49));
        }
        Set<Integer> liczbyUzytkownika = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (liczbyUzytkownika.size() < 6){
            liczbyUzytkownika.add(input(scanner));
        }
        Set<Integer> potrafienia = new HashSet<>();
        for (Integer num : liczbyUzytkownika){
            if (losoweLiczby.contains(num))
                potrafienia.add(num);
        }
        System.out.println("Potrafiłeś " + potrafienia.size() + " liczb!");
        System.out.println(losoweLiczby);
    }

    public static int input(Scanner scanner){
        int num;
        try{
            num = Integer.parseInt(scanner.nextLine());
            if (num < 1 || num > 49)
                throw new NumberFormatException();
        }catch (NumberFormatException e){
            System.out.println("Musi być LICZBA z zakresu 1-49!");
            num = input(scanner);
        }
        return num;
    }

}