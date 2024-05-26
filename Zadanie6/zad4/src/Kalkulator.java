public class Kalkulator {
    public double obliczCene(Ulga ulga, Czas czas) {
        return 4.80 * ulga.getZnizka() * czas.getZnizka();
    }
}
