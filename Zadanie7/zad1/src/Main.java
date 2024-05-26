public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Michał", "Gray");
        Animal dog = new Dog("Tuzik", "Black");
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
    }
}