package generics;

public class Box<T>{
    private T value;
    
    public <U> Box(T value, U description) {
        this.value = value;
        System.out.println(description);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <U> void show(U data){
        System.out.println(data);
    }
}
