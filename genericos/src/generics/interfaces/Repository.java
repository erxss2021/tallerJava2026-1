package generics.interfaces;

public interface Repository<T> {
    void save(T entity);
    T findById(Long id);
    //delete
    //update
    //findAll
}
