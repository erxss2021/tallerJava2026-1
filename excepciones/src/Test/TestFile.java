package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;

public class TestFile {
    public static void main(String[] args) throws IOException{
        //manejo de archivos 
        //el archivo no existe
        // no hay permisos
        //el disco fallo
        //el archivo esta bloqueado
        System.out.println("Antes del bloque try");
        FileReader reader = null;
        try {
            System.out.println("Antes de la exception");
            reader = new FileReader("files/clientes.txt");
            // Files.readString(Path.of("file/text.txt"));
            System.out.println("Archivo abierto.");
        }catch (IOException e) {
            // e.printStackTrace();
            System.out.println("No se encuentra el archivo.");
        }catch(Exception e){
            System.out.println("Exception generica.");
        }
        finally{
            System.out.println(reader);
            if (reader != null) {
                System.out.println("Cerrando objeto reader");
                reader.close();
            }
            System.out.println("Siempre se ejecuta.");
        }
    }

}
