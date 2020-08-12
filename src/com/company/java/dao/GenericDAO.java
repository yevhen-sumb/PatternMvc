package dao;

public interface GenericDAO<T, ID> {
    void save(T item);

    void update(T item);

    void remove(T item);

    T getById(ID id);

}
