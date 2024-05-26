import java.util.Arrays;

public class Bakery extends Shop{
    private String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + " " + Arrays.toString(this.products);
    }
}
