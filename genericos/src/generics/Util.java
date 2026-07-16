package generics;

public class Util {

    public static <T> void print(T data){
        System.out.println("Print...."  + data);
    }

    public static void otrer(){
        System.out.println("Otrer....");
    }

    public static <T> T duplicate(T data){
        return data;
    }

}
