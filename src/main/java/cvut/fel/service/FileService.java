package cvut.fel.service;

import java.util.Date;

import cvut.fel.entity.File;

public interface FileService {

    Iterable<File> findAll();

    File findById(Long id);

    File save(String label, Date date);

    File delete(Long id);

    File update(Long id, String label, Date date);
}
