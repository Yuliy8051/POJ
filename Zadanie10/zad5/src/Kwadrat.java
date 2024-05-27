public class Kwadrat implements Figura, Comparable{
    private int side;

    public Kwadrat(int side) {
        this.side = side;
    }

    @Override
    public double obliczPole() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double obliczObwod() {
        return this.side * 4;
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }
}
