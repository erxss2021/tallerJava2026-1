package clases;

public class Product {
    //Metodos de instacia  -> pertenecen a cada objeto, se necesita la instancia para ejecutar el metodo
    //Metodos estaticos -> Pertenecen a la clase, se invocan sin crear el objeto, se  utiliza la 
    //palabra static
    String code;
    String name;
    double price;
    
    public Product() {
        this("N/A", "Generic Product", 0.0);
    }

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percentage){
        price -= price * percentage / 100;
    }
    
    void showInformation(){
        System.out.println("Code: %s\tName: %s\tPrice: $%.2f".formatted(code, name, price));
    }

    static Product createDemoProduct(){
        return new Product("P001", "Soccer Ball", 600.3456);
    }

}
