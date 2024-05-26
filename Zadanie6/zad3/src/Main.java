public class Main {
    public static void main(String[] args) {
        Punkt srodek = new Punkt(1,2);
        Okrag okrag = new Okrag(srodek, 5);
        Punkt punkt = new Punkt(4,8);
        System.out.println(okrag.czyWewnatrz(punkt));
    }
}