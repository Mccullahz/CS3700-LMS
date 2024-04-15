/*
*
* @author: Zylar :)
*
*/
package application;

public class ConferencePaper extends Publication {
    private AuthorList authorList;
    private String conferenceName;
    private Location location;
    private String period; // period should need broken down more I believe

    public ConferencePaper(String title, String pub_year, AuthorList authorList, String conferenceName, Location location, String period) {
        super(title, pub_year);
        this.authorList = authorList;
        this.conferenceName = conferenceName;
        this.location = location;
        this.period = period;
    }
}
