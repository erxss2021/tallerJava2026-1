package clases;

public class TestProduct {
    public static void main(String[] args) {
        Product productInstance = new Product();
        Product product = Product.createDemoProduct();
        product.applyDiscount(10);
        product.showInformation();

    }
}
