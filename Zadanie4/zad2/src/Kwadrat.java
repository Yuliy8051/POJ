public class Kwadrat {
    int bok;

    public Kwadrat (int bok) {
        this.bok = bok;
    }

    public int obwod (int bok) {
        return bok * 4;
    }

    public double pole (int bok) {
        return Math.pow(bok, 2);
    }
}
