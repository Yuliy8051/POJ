public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new UniqueCar1("blue", "make 1", "something unique");;
        cars[1] = new UniqueCar2("red", "make 2", 3.4d);
        cars[2] = new UniqueCar3("dark", "make 3", true);
        for (Car car : cars) {
            System.out.println(car.color + " " + car.make);
        }
    }
}