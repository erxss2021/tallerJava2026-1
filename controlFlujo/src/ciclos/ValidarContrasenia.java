package ciclos;

import java.util.Scanner;

public class ValidarContrasenia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;
        String passUsuario = "12345";
        while (true) {
            
            System.out.println("Ingresa tu contraseña: ");
            password = in.next();
            if (password.equals(passUsuario)) {
                break;
            }
            System.out.println("Contraseña no valida.");
            System.out.println("Intentar de nuevo.");
    
        }      
        System.out.println("Acceso permitido.");
    }
}
