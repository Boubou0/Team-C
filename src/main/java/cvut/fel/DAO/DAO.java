package cvut.fel.DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    List<T> getAll();
    Optional<T> get(int id);
    void update(T t, String[] params);
    void delete(T t);
    void create(T t);
}