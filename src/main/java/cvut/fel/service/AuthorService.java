package cvut.fel.service;

import cvut.fel.entity.Author;

public interface AuthorService {

    Iterable<Author> findAll();
    Author findById(Long id);
    Author save(String name);
    Author delete(Long id);
    Author update(Long id, String name);
}
