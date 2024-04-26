/*
* @author: Zylar :)
*/
package application;

public class ConferencePaper extends Publication {
    public AuthorList authorList;
    public String conferenceName;
    public Location location;
    public Period period;

    public ConferencePaper(String title, String pub_year, AuthorList authorList, String conferenceName, Location location, Period period) {
        super(title, pub_year);
        this.authorList = authorList;
        this.conferenceName = conferenceName;
        this.location = location;
        this.period = period;
    }
}