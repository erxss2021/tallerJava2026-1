package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {
    public static void main(String[] args){

        try(BufferedWriter writer = new BufferedWriter(
            new FileWriter("files/ventas09.txt"))) {
            writer.write("Ventas 1");
            writer.newLine();
            writer.write("Ventas 2");
            writer.newLine();
            writer.write("Ventas 3");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Forma tradicional para manejo de archivos y liberar recursos
        // BufferedWriter writer = null;
        // try {
        //     writer = new BufferedWriter(new FileWriter("files/ventas09.txt"));
        //     writer.write("Ventas 1");
        //     writer.newLine();
        //     writer.write("Ventas 2");
        //     writer.newLine();
        //     writer.write("Ventas 3");
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }finally{
        //     if (writer != null) {
        //         writer.close();
        //     }
        // }
    }

}
