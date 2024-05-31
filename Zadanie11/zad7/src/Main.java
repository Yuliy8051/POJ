import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(scanner.nextLine());
        }
        System.out.println(evenElements(stringList));
    }
    public static List<String> evenElements(List<String> stringList){
        List<String> oddElements = new ArrayList<>();
        for (String string : stringList){
            if (string.length() % 2 == 1)
                oddElements.add(string);
        }
        for (String string : oddElements){
            stringList.remove(string);
        }
        return stringList;
    }
}