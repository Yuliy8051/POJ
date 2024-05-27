public class Szescian implements Figura, Comparable{
    private int side;

    public Szescian(int side) {
        this.side = side;
    }

    @Override
    public double obliczPole() {
        return 6 * Math.pow(this.side, 2);
    }

    @Override
    public double obliczObwod() {
        return 12 * this.side;
    }
    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }
}
