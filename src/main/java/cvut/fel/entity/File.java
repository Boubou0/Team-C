package cvut.fel.entity;

import java.util.Date;

/**
 * 
 */
public class File {

    /**
     * Default constructor
     */
    public File() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String label;

    /**
     * 
     */
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return
     */
    public Boolean download() {
        // TODO implement here
        return null;
    }

}