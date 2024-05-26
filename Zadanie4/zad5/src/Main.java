public class Main {
    public static void main(String[] args) {
        Wiatrak wiatrak = new Wiatrak();
        Wiatrak wiatrak1 = new Wiatrak(Wiatrak.FAST, true, 5, "blue");
        System.out.println(wiatrak.information());
        System.out.println(wiatrak1.information());
    }
}