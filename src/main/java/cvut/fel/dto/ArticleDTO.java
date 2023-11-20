package cvut.fel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArticleDTO extends AbstractDTO{

    private int version;
    private int state;

    public ArticleDTO() {
    }

    public ArticleDTO(ArticleDTO dto) {
        super(dto);
        version = dto.getVersion();
        state = dto.getState();
    }

    @Override
    protected AbstractDTO clone() {
        return new ArticleDTO(this);
    }
}
