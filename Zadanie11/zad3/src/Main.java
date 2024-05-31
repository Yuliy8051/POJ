import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(countWords(text));
    }

    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> wordAmount = new LinkedHashMap<>();
        text = text.toLowerCase();
        text = text.replaceAll("[,|;|:|.|?|!|-]", " ");
        text = text.replaceAll("( )+", " ");
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(text);
        for (String word : words){
            if (!wordAmount.containsKey(word))
                wordAmount.put(word, 1);
            else
                wordAmount.replace(word, wordAmount.get(word) + 1);
        }
        return wordAmount;
    }
}