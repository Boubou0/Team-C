package cvut.fel.service;

import cvut.fel.entity.FileproofArticle;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.FileproofArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileproofArticleServiceImp implements FileproofArticleService {

    private final FileproofArticleRepository fileproofArticleRepository;

    @Autowired
    public FileproofArticleServiceImp(FileproofArticleRepository fileproofArticleRepository) {
        this.fileproofArticleRepository = fileproofArticleRepository;
    }

    @Override
    public Iterable<FileproofArticle> findAll() {
        return fileproofArticleRepository.findAll();
    }

    @Override
    public FileproofArticle findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return fileproofArticleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("FileproofArticle_NOT_FOUND"));
    }

    @Override
    public FileproofArticle save(String correctionText, int correctionFile) {
        if (correctionText == null || correctionFile < 0)
            throw new FieldMissingException();

        FileproofArticle fileproofArticle = new FileproofArticle(correctionText, correctionFile);
        return fileproofArticleRepository.save(fileproofArticle);
    }

    @Override
    public FileproofArticle delete(Long id) {
        if (id == null)
            throw new FieldMissingException();

        FileproofArticle fileproofArticle = findById(id);
        fileproofArticleRepository.delete(findById(id));
        return fileproofArticle;
    }

    @Override
    public FileproofArticle update(Long id, String correctionText, int correctionFile) {
        if (id == null)
            throw new FieldMissingException();

        FileproofArticle fileproofArticle = findById(id);
        if (correctionText != null)
            fileproofArticle.setCorrectionText(correctionText);

        if (correctionFile < 0)
            fileproofArticle.setCorrectionFile(correctionFile);

        fileproofArticleRepository.save(fileproofArticle);
        return fileproofArticle;
    }
}
