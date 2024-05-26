public class Main {
    public static void main(String[] args) {
        Ulamek ulamek = new Ulamek(5, 25);
        Ulamek ulamek1 = new Ulamek(2,4);
        ulamek.mnozenie(ulamek1);
        ulamek.skrocenie();
        System.out.println(ulamek);
    }
}