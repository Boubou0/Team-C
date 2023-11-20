package cvut.fel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileproofArticleDTO extends AbstractDTO {

    private String correctionText;
    private int correctionFile;

    public FileproofArticleDTO() {
    }

    public FileproofArticleDTO(FileproofArticleDTO dto) {
        super(dto);
        correctionText = dto.getCorrectionText();
        correctionFile = dto.getCorrectionFile();
    }

    @Override
    protected AbstractDTO clone() {
        return new FileproofArticleDTO(this);
    }
}