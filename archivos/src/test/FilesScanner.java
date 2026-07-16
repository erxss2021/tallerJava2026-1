package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesScanner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("files/clientes.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
       
    }
}
