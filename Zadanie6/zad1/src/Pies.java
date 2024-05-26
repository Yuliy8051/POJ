public class Pies {
    public void szczekaj() {
        System.out.println("Szczak!");
    }

    public void szczekaj(int amount) {
        for (int i = 0; i < amount; i++) {
            szczekaj();
        }
    }
}
