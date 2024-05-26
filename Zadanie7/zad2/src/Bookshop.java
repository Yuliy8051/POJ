import java.util.Arrays;

public class Bookshop extends Shop{
    private String[] products;

    public Bookshop(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + " " + Arrays.toString(this.products);
    }
}
