package cvut.fel.service;

import cvut.fel.entity.Corrector;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.CorrectorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrectorServiceImp implements CorrectorService {

    private final CorrectorRepository correctorRepository;

    @Autowired
    public CorrectorServiceImp(CorrectorRepository correctorRepository) {
        this.correctorRepository = correctorRepository;
    }

    @Override
    public Iterable<Corrector> findAll() {
        return correctorRepository.findAll();
    }

    @Override
    public Corrector findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return correctorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("CORRECTOR_NOT_FOUND"));
    }

    @Override
    public Corrector save(String email, String tel) {
        if (email == null || tel == null)
            throw new FieldMissingException();

        Corrector corrector = new Corrector(email, tel);
        return correctorRepository.save(corrector);
    }

    @Override
    public Corrector delete(Long id) {
        if (id == null)
            throw new FieldMissingException();

        Corrector corrector = findById(id);
        correctorRepository.delete(corrector);
        return corrector;
    }

    @Override
    public Corrector update(Long id, String email, String tel) {
        if (id == null)
            throw new FieldMissingException();

        Corrector corrector = findById(id);
        if (email != null)
            corrector.setEmail(email);
        if (tel != null)
            corrector.setTel(tel);

        correctorRepository.save(corrector);
        return corrector;
    }
}
