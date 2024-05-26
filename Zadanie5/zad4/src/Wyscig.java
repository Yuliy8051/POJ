public class Wyscig {
    public static void main(String[] args) {
        Zawodnik[] zawodniks = new Zawodnik[3];
        zawodniks[0] = new Zawodnik("Denys", 15, 2);
        zawodniks[1] = new Zawodnik("Yehor", 16, 1);
        zawodniks[2] = new Zawodnik("Kyrylo", 14, 3);

        while (zawodniks[0].getPokonanaOdliglosc() < 50 && zawodniks[1].getPokonanaOdliglosc() < 50 && zawodniks[2].getPokonanaOdliglosc() < 50){
            zawodniks[0].biegnij();
            zawodniks[1].biegnij();
            zawodniks[2].biegnij();
        }
        if (zawodniks[0].getPokonanaOdliglosc() >= 50) zawodniks[0].przedstawSie();
        else if (zawodniks[1].getPokonanaOdliglosc() >= 50) zawodniks[1].przedstawSie();
        else zawodniks[2].przedstawSie();

    }

}
