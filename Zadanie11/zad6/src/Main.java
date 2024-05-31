import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz 10 unikatowych liczb. (nie unikatowe zostaną pomienięte i będziesz wpisywał dopóki program nie będzie miał 10 unikatowych liczb)");
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size() < 10){
            integerSet.add(input(scanner));
        }
        int sum = 0;
        for (Integer num : integerSet){
            sum += num;
        }
        System.out.println(sum);

    }
    public static int input(Scanner scanner){
        int num;
        try{
            num = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.err.println("Musisz wpisać liczbę!");
            num = input(scanner);
        }
        return num;
    }
}