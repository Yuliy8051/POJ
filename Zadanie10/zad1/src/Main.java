import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Input");
        try(Scanner scanner = new Scanner(file)){
            int i = 0;
            while (scanner.hasNextLine()){
                ++i;
                String line = scanner.nextLine();
                if (i % 2 == 1) {
                    System.out.print(line + " ");
                }
            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}