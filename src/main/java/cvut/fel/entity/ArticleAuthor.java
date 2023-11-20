package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "article_author")
@NamedQueries({
        @NamedQuery(name = "ArticleAuthor.findAuthorsByArticle", query = "SELECT u.author FROM ArticleAuthor u WHERE u.article = :article"),
})
@Getter
@Setter
public class ArticleAuthor extends AbstractEntity {

    @NotNull
    private Long article;
    @NotNull
    private Long author;

    public ArticleAuthor() {
    }

    public ArticleAuthor(Long article, Long author) {
        this();
        this.article = article;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ArticleAuthor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", article=" + article +
                ", author=" + author +
                '}';
    }
}
