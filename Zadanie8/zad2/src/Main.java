import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        try {
            throwAnException(message);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void throwAnException(String line){
        throw new RuntimeException(line);
    }
}