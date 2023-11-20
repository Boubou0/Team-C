package cvut.fel.service;

import java.util.List;

import cvut.fel.entity.Article;
import cvut.fel.entity.ArticleAuthor;

public interface ArticleAuthorService {

    Iterable<ArticleAuthor> findAll();
    ArticleAuthor findById(Long id);
    ArticleAuthor save(Long article, Long author);
    ArticleAuthor delete(Long id);
    ArticleAuthor update(Long id, String name, Long article, Long author);

    Iterable<Long> findAuthorsByArticle(Long article);
}
