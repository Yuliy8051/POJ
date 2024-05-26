public class Main {
    public static void main(String[] args) {
        Shop bookshop = new Bookshop("Pawlowa 21", 64, new String[]{"Book 1","Book 2"});
        Shop bakery = new Bakery("Mickiewicza 89", 97, new String[]{"Cake","Сupcake"});
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}