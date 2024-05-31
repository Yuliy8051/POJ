import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(uniqueElementsAmount(text));
    }
    public static int uniqueElementsAmount(String text){
        String[] symbols = text.split("");
        Set<String> uniqueSymbols = new HashSet<>(Arrays.asList(symbols));
        return uniqueSymbols.size();
    }
}