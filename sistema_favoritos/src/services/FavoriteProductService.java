package services;

import java.util.LinkedHashSet;
import java.util.Set;

import models.FavoriteProduct;

public class FavoriteProductService {

    private final Set<FavoriteProduct>  favoriteProducts;

    public FavoriteProductService() {
        this.favoriteProducts = new LinkedHashSet<>();
    }

    public boolean addFavoriteProduct(FavoriteProduct product){
        return favoriteProducts.add(product);
    }

    public boolean removeFavoriteProduct(FavoriteProduct product){
        return favoriteProducts.remove(product);
    }

    public boolean containsFavoriteProduct(FavoriteProduct product){
        return favoriteProducts.contains(product);
    }

    public void showFavoriteProducts(){
        if (favoriteProducts.isEmpty()) {
            System.out.println("No existen productos favoritos.");
            return ;
        }

        System.out.println("=================PRODUCTOS FAVORITOS==========");
        favoriteProducts.forEach(f -> System.out.println(f));
    }
    
}
