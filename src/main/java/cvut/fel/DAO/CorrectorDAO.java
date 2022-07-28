package cvut.fel.DAO;

import cvut.fel.entity.Corrector;

import java.util.List;
import java.util.Optional;

public class CorrectorDAO implements DAO<Corrector> {
    @Override
    public List<Corrector> getAll() {
        return null;
    }

    @Override
    public Optional<Corrector> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Corrector corrector, String[] params) {

    }

    @Override
    public void delete(Corrector corrector) {

    }

    @Override
    public void create(Corrector corrector) {

    }
}
