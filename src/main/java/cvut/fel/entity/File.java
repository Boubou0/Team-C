package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "file")
@Getter @Setter
public class File extends AbstractEntity {

    @Column(unique = true)
    @NotNull
    private String label;
    @NotNull
    private Date date;

    public File() {
    }

    public File(String label, Date date) {
        this();
        this.label = label;
        this.date = date;
    }

    public Boolean download() {
        // TODO implement here
        return null;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", date=" + date +
                '}';
    }
}