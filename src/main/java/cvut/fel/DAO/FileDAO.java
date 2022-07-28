package cvut.fel.DAO;

import cvut.fel.entity.File;

import java.util.List;
import java.util.Optional;

public class FileDAO implements DAO<File>{
    @Override
    public List<File> getAll() {
        return null;
    }

    @Override
    public Optional<File> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(File file, String[] params) {

    }

    @Override
    public void delete(File file) {

    }

    @Override
    public void create(File file) {

    }
}
