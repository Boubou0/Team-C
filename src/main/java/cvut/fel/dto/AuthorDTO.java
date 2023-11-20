package cvut.fel.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AuthorDTO extends AbstractDTO {

    public AuthorDTO() {
    }

    public AuthorDTO(AuthorDTO dto) {
        super(dto);
    }

    @Override
    public AbstractDTO clone() {
        return new AuthorDTO(this);
    }

}
