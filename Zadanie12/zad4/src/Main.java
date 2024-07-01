import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(countVowels(text));
    }

    public static Map<String, Integer> countVowels(String text){
        text = text.toLowerCase();
        Map<String, Integer> vowelsAmount = new HashMap<>();
        String[] letters = text.split("");
        for (String letter : letters){
            if (Pattern.matches("[eyuoiaęąó]", letter)){
                if (!vowelsAmount.containsKey(letter))
                    vowelsAmount.put(letter, 1);
                else vowelsAmount.replace(letter, vowelsAmount.get(letter) + 1);
            }
        }
        return vowelsAmount;
    }
}