package cvut.fel.service;

import cvut.fel.entity.Article;

public interface ArticleService {

    Iterable<Article> findAll();
    Article findById(Long id);
    Article save(String name, int version, int state);
    Article delete(Long id);
    Article update(Long id, String name,  int version, int state);
}
