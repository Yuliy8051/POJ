public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.NORMALNY, Czas.JEDNIRAZOWY));
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.NORMALNY, Czas.GODZINNY));
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.NORMALNY, Czas.DOBOWY));
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.ULGOWY, Czas.JEDNIRAZOWY));
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.ULGOWY, Czas.GODZINNY));
        System.out.printf("%.2f\n", kalkulator.obliczCene(Ulga.ULGOWY, Czas.DOBOWY));
    }
}