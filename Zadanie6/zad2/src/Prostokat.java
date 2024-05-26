public class Prostokat {
    private int a, b;

    public Prostokat(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Prostokat(int a) {
        this.a = a;
        this.b = a;
    }

    public void suma() {
        System.out.println(this.a * 2 + this.b * 2);
    }

    public void pole() {
        System.out.println(this.a * this.b);
    }
}
