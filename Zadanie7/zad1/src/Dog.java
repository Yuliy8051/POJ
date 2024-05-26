public class Dog extends Animal{
    public Dog (String name, String color){
        super(name, color);
    }
    @Override
    public String makeSound() {
        return "Hau, Hau " + this.name + " " + this.color;
    }
}
