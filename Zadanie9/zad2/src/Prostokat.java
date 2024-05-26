public class Prostokat extends Figura2D{
    public Prostokat(int side1, int side2) {
        super(new int[]{side1,side2,side1,side2});
    }

    @Override
    public int suma() {
        return this.sides[0] * 2 + this.sides[1] * 2;
    }

    @Override
    public double pole() {
        return this.sides[0] * this.sides[1];
    }
}
