package test;

import java.nio.file.OpenOption;

import enums.Country;
import enums.DocumentType;
import enums.Operation;
import enums.OrderStatus;
import enums.Priority;
import enums.Season;
import enums.UserRole;

public class Test {
    public static void main(String[] args) {
       OrderStatus status = OrderStatus.PAID;
       System.out.println(status);

       System.out.println("Valor numerico: " + Priority.LOW.ordinal());
       System.out.println("Nombre: " + Priority.LOW.name());
       System.out.println("Descripcion: " + Priority.LOW.getDescription());

       UserRole role = UserRole.CLIENT;
       System.out.println("CompareTo: " + role.compareTo(UserRole.ADMIN));
       System.out.println("Equals: " + (role == UserRole.CLIENT));  //==
       System.out.println("toString(): " + role.CLIENT);
       System.out.println(role.isAdmin());


       System.out.println(Season.totalSeasons());

       int result = Operation.ADD.apply(3, 5);
       System.out.println(result);

       DocumentType.PDF.print();

       System.out.println(Country.CANADA.name());
    }
      
}
