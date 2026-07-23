package models;

import java.math.BigDecimal;

public class ProductTraditional {
    private final String sku;
    private final String name;
    private final BigDecimal price;

    public ProductTraditional(String sku, String name, BigDecimal price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductTraditional [sku=" + sku + ", name=" + name + ", price=" + price + "]";
    }    

}
