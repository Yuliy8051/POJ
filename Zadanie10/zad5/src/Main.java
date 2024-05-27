import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        Szescian szescian = new Szescian(2);
        Kolo kolo = new Kolo(2);
        Figura[] figuras = {kwadrat, szescian, kolo};
        Arrays.sort(figuras);
        for (Figura figura : figuras){
            System.out.println(figura.obliczObwod());
            System.out.println(figura.obliczPole());
        }
    }
}