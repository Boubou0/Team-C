package cvut.fel.service;

import cvut.fel.entity.Corrector;

public interface CorrectorService {

    Iterable<Corrector> findAll();

    Corrector findById(Long id);

    Corrector save(String email, String tel);

    Corrector delete(Long id);

    Corrector update(Long id, String email, String tel);
}
