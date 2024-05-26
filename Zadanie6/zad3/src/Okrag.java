import static java.lang.Math.pow;

public class Okrag {
    private Punkt srodek;
    private int promien;

    public Okrag(Punkt srodek, int promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public boolean czyWewnatrz(Punkt punkt) {
        return Math.sqrt(pow(this.srodek.getX() - punkt.getX(), 2) + pow(this.srodek.getY() - punkt.getY(), 2)) <= this.promien;
    }
}
