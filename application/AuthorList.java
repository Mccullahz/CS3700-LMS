
package application;

public class AuthorList {
    private String[] authors;

    public AuthorList(String[] authors) {
        this.authors = authors;
    }
    
    public String[] getAuthors() {
        return authors;
    }
    
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
