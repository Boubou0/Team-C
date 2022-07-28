package cvut.fel.entity;

/**
 * 
 */
public class FileproofArticle {

    /**
     * Default constructor
     */
    public FileproofArticle() {
    }

    /**
     * 
     */
    private String correctionText;

    /**
     * 
     */
    private File correctionFile;

    public String getCorrectionText() {
        return correctionText;
    }

    public void setCorrectionText(String correctionText) {
        this.correctionText = correctionText;
    }

    public File getCorrectionFile() {
        return correctionFile;
    }

    public void setCorrectionFile(File correctionFile) {
        this.correctionFile = correctionFile;
    }

    /**
     * @param article 
     * @return
     */
    public Boolean upload(Article article) {
        // TODO implement here
        return null;
    }

}