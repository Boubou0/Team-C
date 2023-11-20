package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Getter @Setter
public class Author extends AbstractEntity{

    public Author() {
    }

    public Author(String name) {
        this();
        super.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}