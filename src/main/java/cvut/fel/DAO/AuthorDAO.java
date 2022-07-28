package cvut.fel.DAO;

import cvut.fel.entity.Author;

import java.util.List;
import java.util.Optional;

public class AuthorDAO implements DAO<Author>{

    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public Optional<Author> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Author author, String[] params) {

    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public void create(Author author) {

    }
}
