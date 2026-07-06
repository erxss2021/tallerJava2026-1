package interfaces;

public interface Printer {
    //Constante
    int MAX_USERS = 10;

    //Metodos abstractos
    void print();

    //metodo default
    default void info(){
        validate();
        System.out.println("Info");
    }

    //metodo static
    static int sum(int x, int y){
        return x + y;
    }

    //metodo privado
    private void validate(){
        System.out.println( "Valid");
    }


}
