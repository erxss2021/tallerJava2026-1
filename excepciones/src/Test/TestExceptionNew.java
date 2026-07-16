package Test;

import excepciones.InsufficientStockException;
import excepciones.InvalidOrderException;

public class TestExceptionNew {
    public static void main(String[] args) {
        String order = null;
        try {
            verifyOrder(order);
        } catch (InvalidOrderException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
         // try {
        //     stock(2);
        //     System.out.println("Stock.");
        // } catch (InsufficientStockException e) {
        //     // e.printStackTrace();
        //     System.out.println(e.getMessage());
        // }
        System.out.println("Flujo normal.");
    }

    public static void verifyOrder(String order){
        if (order == null) {
            throw new InvalidOrderException("Order cannot be null");
        }
    }

    public static void stock(int quantity) throws InsufficientStockException{
        if (quantity < 5 ) {
            throw new InsufficientStockException("Not enough stock");
        }
    }
}
