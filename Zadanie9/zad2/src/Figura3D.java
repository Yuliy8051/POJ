public abstract class Figura3D extends Figura{
    public Figura3D(int[] sides) {
        super(sides);
    }

    @Override
    public abstract int suma();
    @Override
    public abstract double pole();
    public abstract double volume();
}
