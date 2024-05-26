public class Wiatrak {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak() {
        this.speed = MEDIUM;
        this.on = true;
        this.radius = 10;
        this.color = "white";
    }

    public Wiatrak (int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String information () {
        return "speed: " + this.speed + "\nis it turned on: " + this.on + "\nradius: " + this.radius + "\ncolor: " + this.color;
    }
}
