public class MyCircle {
    int radius;

    public MyCircle (int radius) {
        this.radius = radius;
    }

    public double obwod (int radius) {
        return radius * Math.PI * 2;
    }

    public double pole (int radius) {
        return radius * radius * Math.PI;
    }

    public int srednica (int radius) {
        return radius * 2;
    }
}
