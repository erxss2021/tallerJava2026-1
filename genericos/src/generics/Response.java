package generics;

public class Response<T, E> {
    private T data;
    private E error;
    public Response(T data, E error) {
        this.data = data;
        this.error = error;
    }
    public T getData() {
        return data;
    }
    public E getError() {
        return error;
    } 
    
}
