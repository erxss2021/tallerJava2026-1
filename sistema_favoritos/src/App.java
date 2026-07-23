import java.math.BigDecimal;

import models.FavoriteProduct;
import services.FavoriteProductService;

public class App {
    public static void main(String[] args){
        FavoriteProductService service = new FavoriteProductService();
        FavoriteProduct laptop = new FavoriteProduct("SKU-001", "Laptop", new BigDecimal("25000"));
        FavoriteProduct mouse = new FavoriteProduct("SKU-002", "Mouse Gamer", new BigDecimal("900"));
        FavoriteProduct keyboard = new FavoriteProduct("SKU-003", "Keyboard", new BigDecimal("1400"));
        FavoriteProduct duplique = new FavoriteProduct("SKU-001", "Laptop", new BigDecimal("25000"));

        System.out.println(service.addFavoriteProduct(laptop));
        System.out.println(service.addFavoriteProduct(mouse));
        System.out.println(service.addFavoriteProduct(keyboard));
        System.out.println(service.addFavoriteProduct(duplique));
        service.showFavoriteProducts();

        System.out.println("============================BUSQUEDA=========================");
        System.out.println(service.containsFavoriteProduct(
            new FavoriteProduct("SKU-001", "Laptop Gamer", new BigDecimal("25000"))
        ));

        System.out.println("========================ELIMINAR FAVORITO===================");
        System.out.println(service.removeFavoriteProduct(
             new FavoriteProduct("SKU-001", "Laptop Gamer", new BigDecimal("25000"))
        ));

        service.showFavoriteProducts();


    }
}
