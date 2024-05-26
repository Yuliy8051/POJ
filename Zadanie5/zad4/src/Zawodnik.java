import java.util.Random;

public class Zawodnik {
    private String imie;
    private int predkoscMax;
    private int predkoscMin;
    private double pokonanaOdliglosc;

    public Zawodnik(String imie, int predkoscMax, int predkoscMin) {
        this.imie = imie;
        this.predkoscMax = predkoscMax;
        this.predkoscMin = predkoscMin;
        this.pokonanaOdliglosc = 0;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + this.imie + " biegam z prędkością " + this.predkoscMin + "-" + this.predkoscMax +"km/h");
    }

    public void biegnij() {
        Random random = new Random();
        int predkosc = random.nextInt(this.predkoscMax - this.predkoscMin + 1) + predkoscMin;
        this.pokonanaOdliglosc += predkosc;
    }

    public double getPokonanaOdliglosc() {
        return pokonanaOdliglosc;
    }
}
