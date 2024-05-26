public class Prostopadloscian extends Figura3D{
    public Prostopadloscian(int side1, int side2, int side3) {
        super(new int[]{side1, side2, side3, side1, side2, side3, side1, side2, side3});
    }

    @Override
    public int suma() {
        return (sides[0] + sides[1] + sides[2]) * 4;
    }

    @Override
    public double pole() {
        return 2 * (sides[0] * sides[1] + sides[0] * sides[2] + sides[1] * sides[2]);
    }

    @Override
    public double volume() {
        return sides[0] * sides[1] * sides[2];
    }
}
