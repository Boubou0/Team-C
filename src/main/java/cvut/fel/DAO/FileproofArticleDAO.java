package cvut.fel.DAO;

import cvut.fel.entity.FileproofArticle;

import java.util.List;
import java.util.Optional;

public class FileproofArticleDAO implements DAO<FileproofArticle> {
    @Override
    public List<FileproofArticle> getAll() {
        return null;
    }

    @Override
    public Optional<FileproofArticle> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(FileproofArticle fileproofArticle, String[] params) {

    }

    @Override
    public void delete(FileproofArticle fileproofArticle) {

    }

    @Override
    public void create(FileproofArticle fileproofArticle) {

    }
}
