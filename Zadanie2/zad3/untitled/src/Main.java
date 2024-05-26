import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a;
        int hour;
        int minute;
        while (true) {
            String time = scanner.nextLine();
            a = time.contains(":");
            if (!a) {
                System.out.println("Wrong time!\nTry again.");
                continue;
            }
            String[] parts = time.split(":");
            hour = Integer.parseInt(parts[0]);
            minute = Integer.parseInt(parts[1]);
            if (0 > hour || hour > 23 || minute < 0 || minute > 60) {
                System.out.println("Wrong time!\nTry again.");
                continue;
            }
            break;
        }
        if (hour < 12) System.out.println(hour + ":" + minute + " AM");
        else System.out.println(hour - 12 + ":" + minute + " PM");
    }
}