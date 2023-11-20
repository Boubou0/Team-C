package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "fileproof_article")
@Getter @Setter
public class FileproofArticle extends AbstractEntity {

    private String correctionText;
    private int correctionFile;

    public FileproofArticle() {
    }

    public FileproofArticle(String correctionText, int correctionFile) {
        this();
        this.correctionText = correctionText;
        this.correctionFile = correctionFile;
    }

    public Boolean upload(Article article) {
        // TODO implement here
        return null;
    }

    @Override
    public String toString() {
        return "FileproofArticle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", correctionText='" + correctionText + '\'' +
                ", correctionFile=" + correctionFile +
                '}';
    }
}