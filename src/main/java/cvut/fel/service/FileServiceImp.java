package cvut.fel.service;

import cvut.fel.entity.File;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.ArticleRepository;
import cvut.fel.repository.FileRepository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImp implements FileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileServiceImp(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public Iterable<File> findAll() {
        return fileRepository.findAll();
    }

    @Override
    public File findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return fileRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("FILE_NOT_FOUND"));
    }

    @Override
    public File save(String label, Date date) {
        if (label == null)
            throw new FieldMissingException();

        File file = new File(label, date);
        return fileRepository.save(file);
    }

    @Override
    public File delete(Long id) {
        if (id == null)
            throw new FieldMissingException();

        File file = findById(id);
        fileRepository.delete(findById(id));
        return file;
    }

    @Override
    public File update(Long id, String label, Date date) {
        if (id == null)
            throw new FieldMissingException();

        File file = findById(id);
        if (label != null)
            file.setLabel(label);
        if (date != null)
            file.setDate(date);
        fileRepository.save(file);
        return file;
    }
}
