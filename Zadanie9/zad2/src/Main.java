public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Kwadrat(1);
        figuras[1] = new Prostokat(4,5);
        figuras[2] = new Prostopadloscian(4, 5 , 6);
        figuras[3] = new Szescian(4);
        for (Figura figura : figuras){
            System.out.println(figura.pole());
            System.out.println(figura.suma());
        }

    }
}