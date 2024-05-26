public class Moneta {
    public Strona rzut() {
        if (Math.random() >= 0.5f) return Strona.RESZKA;
        else return Strona.ORZEL;
    }
}
