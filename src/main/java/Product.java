public class Product {
    private String product;
    private int init;

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", init=" + init +
                '}';
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public Product(String product, int init) {
        this.product = product;
        this.init = init;
    }

    public Product() {
    }
}
