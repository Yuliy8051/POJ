import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba patryk = new Osoba("Patryk", "Andrzejewski");
        Osoba witold = new Osoba("Witold", "Anisimow ");
        Osoba szymon = new Osoba("Szymon", "Baniewicz ");
        Osoba[] osoby = {patryk, witold, szymon};
        for (Osoba osoba : osoby){
            System.out.println(osoba);
        }
        Arrays.sort(osoby);
        for (Osoba osoba : osoby){
            System.out.println(osoba);
        }
    }
}