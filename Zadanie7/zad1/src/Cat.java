public class Cat extends Animal{
    public Cat (String name, String color) {
        super(name, color);
    }
    @Override
    public String makeSound() {
        return "miau, miau " + this.name + " " + this.color;
    }
}
