package cvut.fel.repository;

import cvut.fel.entity.ArticleAuthor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleAuthorRepository extends CrudRepository<ArticleAuthor, Long> {

    List<Long> findAuthorsByArticle(Long article);
}
