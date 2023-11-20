package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "article")
@Getter @Setter
public class Article extends AbstractEntity {

    @NotNull
    private int version;
    @NotNull
    private int state;

    public Article() {
    }

    public Article(String name, int version, int state){
        this();
        super.name = name;
        this.version = version;
        this.state = state;
    }

    public Boolean download() {
        //TODO
        return true;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version=" + version +
                ", state=" + state +
                '}';
    }
}