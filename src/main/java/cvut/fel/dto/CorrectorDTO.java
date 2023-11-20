package cvut.fel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CorrectorDTO extends AbstractDTO {

    private String email;
    private String tel;

    public CorrectorDTO() {
    }

    public CorrectorDTO(CorrectorDTO dto) {
        super(dto);
        email = dto.getEmail();
        tel = dto.getTel();
    }

    @Override
    protected AbstractDTO clone() {
        return new CorrectorDTO(this);
    }
}
