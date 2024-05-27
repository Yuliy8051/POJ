public class Kolo implements Figura, Comparable{
    private int radius;
    public Kolo(int radius) {
        this.radius = radius;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public int compareTo(Object o) {
        Figura that = (Figura)o;
        return Double.compare(this.obliczPole(), that.obliczPole());
    }
}
