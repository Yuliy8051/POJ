import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            throwException(line);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void throwException(String line) throws IOException {
        throw new IOException(line);
    }
}