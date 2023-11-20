package cvut.fel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "corrector")
@Getter @Setter
public class Corrector extends AbstractEntity {

    @Column(unique = true)
    @NotNull
    private String email;
    @Column(unique = true)
    @NotNull
    private String tel;

    public Corrector() {
    }

    public Corrector(String email, String tel) {
        this();
        this.email = email;
        this.tel = tel;
    }

    public Boolean sendEmail() {
        // TODO implement here
        return null;
    }

    @Override
    public String toString() {
        return "Corrector{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}