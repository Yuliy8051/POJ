import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int i = 0;
        int yearAmount;
        while (i < 100){
            localDate = localDate.plusYears(1);
            yearAmount = localDate.lengthOfYear();
            if (yearAmount == 366){
                i++;
                System.out.println(localDate.getYear());
            }
        }
    }
}