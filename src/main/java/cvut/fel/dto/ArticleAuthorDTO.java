package cvut.fel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArticleAuthorDTO extends AbstractDTO {

    private Long article;
    private Long author;

    public ArticleAuthorDTO() {
    }

    public ArticleAuthorDTO(ArticleAuthorDTO dto) {
        super(dto);
        article = dto.getArticle();
        author = dto.getAuthor();
    }

    @Override
    public AbstractDTO clone() {
        return new ArticleAuthorDTO(this);
    }

}
