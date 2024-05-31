import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(skorowidzLiterowy(text));
    }
    public static Map<String, Set<Integer>> skorowidzLiterowy(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[.|,!?/@#$%^&*(){}'\";:+=0-9-]", "");
        text = text.replaceAll("( )+", "");
        String[] letters = text.split("");
        Map<String, Set<Integer>> lettersPositions = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            if (!lettersPositions.containsKey(letters[i])){
                Set<Integer> positions = new LinkedHashSet<>();
                positions.add(i+1);
                lettersPositions.put(letters[i], positions);
            }
            else
                lettersPositions.get(letters[i]).add(i+1);
        }
        return lettersPositions;
    }
}