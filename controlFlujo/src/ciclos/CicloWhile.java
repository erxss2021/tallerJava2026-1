package ciclos;

public class CicloWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        // for(int i = 1; i <= 50; i++){
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }
    }
}
