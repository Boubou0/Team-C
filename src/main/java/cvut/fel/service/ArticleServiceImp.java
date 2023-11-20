package cvut.fel.service;

import cvut.fel.entity.Article;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService{

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return articleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ARTICLE_NOT_FOUND"));
    }

    @Override
    public Article save(String name, int version, int state) {
        if (name == null)
            throw new FieldMissingException();

        Article article = new Article(name, version, state);
        return articleRepository.save(article);
    }

    @Override
    public Article delete(Long id) {
        if (id == null)
            throw new FieldMissingException();

        Article article = findById(id);
        articleRepository.delete(article);
        return article;
    }

    @Override
    public Article update(Long id, String name, int version, int state) {
        if (id == null)
            throw new FieldMissingException();

        Article article = findById(id);
        if (name  != null)
            article.setName(name);
        if (version < 0)
            article.setVersion(version);
        if (state < 0)
            article.setVersion(state);
        articleRepository.save(article);
        return article;
    }
}
