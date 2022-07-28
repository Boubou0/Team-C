package cvut.fel.DAO;



import cvut.fel.entity.Article;

import java.util.List;
import java.util.Optional;

public class ArticleDAO implements DAO<Article> {

    @Override
    public List<Article> getAll() {
        return null;
    }

    @Override
    public Optional<Article> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Article article, String[] params) {

    }

    @Override
    public void delete(Article article) {

    }

    @Override
    public void create(Article article) {

    }
}