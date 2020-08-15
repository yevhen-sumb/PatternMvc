package dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface GenericDAO<T, ID> {
    void save(T item);

    void update(ID id, T item);

    void remove(T item);

    T getById(ID id);

    List<T> getAll();

}
