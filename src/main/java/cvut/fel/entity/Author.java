package cvut.fel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * 
 */
@Entity
public class Author extends AbstractEntity{

    /**
     * Default constructor
     */
    public Author() {
    }
    //private List<Article> articles;

    /**
     * 
     */
    private String name;

    public Long getId() {
        return super.id;
    }

    public void setId(Long id) {
        super.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 /*   public List<Article> getArticles(){ return this.articles; }
    public void addArticle(Article article){ this.articles.add(article); }
    public void removeArticle(Article article){ this.articles.remove(article); }*/
}