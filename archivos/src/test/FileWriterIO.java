package test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterIO {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("files/venta.txt");
            writer.write("Hola ventas");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            if (writer != null) {
                writer.close();
            }
        }
    }
}
