public class Punkt {
    int x, y;

    public Punkt () {
        this.x = 0;
        this.y = 0;
    }

    public Punkt (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double odleglosc1 (int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double odleglosc2 (Punkt punkt) {
        return Math.sqrt((this.x - punkt.x) * (this.x - punkt.x) + (this.y - punkt.y) * (this.y - punkt.y));
    }
}