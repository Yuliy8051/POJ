import java.sql.SQLOutput;

public class Karta {
    private Kolor kolor;
    private Figura figura;
    private Kolor[] kolors = Kolor.values();
    private Figura[] figuras = Figura.values();
    public Karta (Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public String toString() {
        return this.figura + " " + this.kolor;
    }
    public void talia(){
        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < kolors.length; j++) {
                Karta karta = new Karta(kolors[j], figuras[i]);
                System.out.println(karta);
            }
        }
    }
}
