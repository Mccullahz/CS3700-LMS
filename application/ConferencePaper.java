/*
*
* @author: Zylar McCullah
*
*/
package application;

public class ConferencePaper extends Publication {
    private AuthorList authorList;
    private String conferenceName;
    private Location location;
    private String period; // period should need broken down more i believe

    public ConferencePaper(String title, int publicationYear, AuthorList authorList, String conferenceName, Location location, String period) {
        super(title, publicationYear);
        this.authorList = authorList;
        this.conferenceName = conferenceName;
        this.location = location;
        this.period = period;
    }

    // Getters and setters
}
