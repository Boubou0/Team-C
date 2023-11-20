package cvut.fel.service;

import cvut.fel.entity.Author;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImp(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return authorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("AUTHOR_NOT_FOUND"));
    }

    @Override
    public Author save(String name) {
        if (name == null)
            throw new FieldMissingException();

        Author author = new Author(name);
        return authorRepository.save(author);
    }

    @Override
    public Author delete(Long id) {
        if (id == null)
            throw new FieldMissingException();
        Author author = findById(id);
        authorRepository.delete(author);
        return author;
    }

    @Override
    public Author update(Long id, String name) {
        if (id == null)
            throw new FieldMissingException();

        Author author = findById(id);
        if (name != null)
            author.setName(name);
        authorRepository.save(author);
        return author;
    }
}
