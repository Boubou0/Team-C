package cvut.fel.service;

import cvut.fel.entity.ArticleAuthor;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.ArticleAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleAuthorServiceImp implements ArticleAuthorService {

    private final ArticleAuthorRepository articleAuthorRepository;

    @Autowired
    public ArticleAuthorServiceImp(ArticleAuthorRepository articleAuthorRepository) {
        this.articleAuthorRepository = articleAuthorRepository;
    }

    @Override
    public Iterable<ArticleAuthor> findAll() {
        return articleAuthorRepository.findAll();
    }

    @Override
    public ArticleAuthor findById(Long id) {
        if (id == null)
            throw new FieldMissingException();
        return articleAuthorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ARTICLEAUTHOR_NOT_FOUND"));
    }

    @Override
    public ArticleAuthor save(Long article, Long author) {
        if (article == null)
            throw new FieldMissingException();
        if (author == null)
            throw new FieldMissingException();
        ArticleAuthor articleAuthor = new ArticleAuthor(article, author);
        return articleAuthorRepository.save(articleAuthor);
    }

    @Override
    public ArticleAuthor delete(Long id) {
        if (id == null)
            throw new FieldMissingException();

        ArticleAuthor articleAuthor = findById(id);
        articleAuthorRepository.delete(articleAuthor);
        return articleAuthor;
    }

    @Override
    public ArticleAuthor update(Long id, String name, Long article, Long author) {
        if (id == null)
            throw new FieldMissingException();

        ArticleAuthor articleAuthor = findById(id);
        if (name != null)
            articleAuthor.setName(name);
        if (article != null)
            articleAuthor.setArticle(article);
        if (author != null)
            articleAuthor.setArticle(author);
        articleAuthorRepository.save(articleAuthor);
        return articleAuthor;
    }

    @Override
    public List<Long> findAuthorsByArticle(Long article) {
        if (article == null)
            throw new FieldMissingException();
        return articleAuthorRepository.findAuthorsByArticle(article);
    }
}
