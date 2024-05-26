import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie;
        String nazwisko;
        int rok;
        while (true){
            try {
                imie = scanner.nextLine();
                nazwisko = scanner.nextLine();
                rok = scanner.nextInt();
                Osoba osoba = new Osoba(imie, nazwisko, rok);
                System.out.println(osoba);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}