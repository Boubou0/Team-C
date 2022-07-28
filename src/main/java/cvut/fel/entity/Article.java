package cvut.fel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Entity
public class Article extends AbstractEntity {

    /**
     * Default constructor
     */
    public Article() {

    }



  //  private List<Author> authors;
    //private List<articleState> states;
    /**
     *
     */
    @Column
    private int version;

    /**
     *
     */
   // private ArrayList<articleState> states;

    public Long getId() {
        return super.id;
    }

    public void setId(Long id) {
        super.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

   /* public ArrayList<articleState> getState() {
        return states;
    }*/
   /* public void addState(articleState state) {
        this.states.add(state);
    }
    public void removeState(articleState state){
        this.states.remove(state);
    }*/

    /**
     * @return
     */
    public Boolean download() {
        // TODO implement here
        return null;
    }

    /**
     * @param version
     * @return
     */
    public Article getOldVersion(int version) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static ArrayList<Article> getAllHurry() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public static ArrayList<Article> getAllNew() {
        // TODO implement here
        return null;
    }

}