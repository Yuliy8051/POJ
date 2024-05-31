import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(zliczLitery(text));
    }

    public static Map<String, Integer> zliczLitery(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[.,!?/@#$%^&*(){}';:+=0-9-]", "");
        text = text.replaceAll("( )+", "");
        Map<String, Integer> formatAmount= new HashMap<>();
        formatAmount.put("spolgloski", 0);
        formatAmount.put("samogloski", 0);
        String[] letters = text.split("");
        Map<String, Integer> lettersAmount = new HashMap<>();
        for (String letter : letters){
            if (!lettersAmount.containsKey(letter)){
                lettersAmount.put(letter, 1);
            }
            else lettersAmount.replace(letter, lettersAmount.get(letter) + 1);
        }
        Set<String> capturedLetters = lettersAmount.keySet();
        for (String letter : capturedLetters){
            if (Pattern.matches("[eyuoia]", letter))
                formatAmount.replace("samogloski", formatAmount.get("samogloski") + lettersAmount.get(letter));
            else
                formatAmount.replace("spolgloski", formatAmount.get("spolgloski") + lettersAmount.get(letter));
        }
        return formatAmount;
    }
}