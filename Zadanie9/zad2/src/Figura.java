public abstract class Figura {
    protected int[] sides;

    public Figura(int[] sides) {
        check(sides);
        this.sides = sides;
    }

    public abstract double pole();
    public abstract int suma();
    public void check(int [] sides){
        for(int side : sides){
            if (side == 0)
                throw new IllegalArgumentException("side can not be 0");
        }
    }
}
