package cvut.fel.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileDTO extends AbstractDTO {

    private String label;
    private Date date;

    public FileDTO() {
    }

    public FileDTO(FileDTO dto) {
        super(dto);
        label = dto.getLabel();
        date = dto.getDate();
    }

    @Override
    protected AbstractDTO clone() {
        return new FileDTO(this);
    }
}
