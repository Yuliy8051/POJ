import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showDate(scanner);
    }

    public static void showDate(Scanner scanner){
        try {
            System.out.println("Enter a format:");
            String format = scanner.nextLine();
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern(format);
            LocalDate currentDate = LocalDate.now();
            System.out.println(currentDate.format(pattern));
        }catch (IllegalArgumentException | UnsupportedTemporalTypeException e){
            System.err.println("Wrong format!");
            System.out.println("Enter it again:");
            showDate(scanner);
        }
    }
}