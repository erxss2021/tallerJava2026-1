package models;

public record Product(Long id, String name, double price) implements Comparable<Product>{

    @Override
    public int compareTo(Product o) {
        // return this.id.compareTo(o.id);
        return Double.compare(this.price, o.price);
    }
}
