/*
* @author: Zylar :)
*/
package application;

public class ConferencePaper extends Publication {
    public String conferenceName;
    public Location location;
    public Period period;

    public ConferencePaper(String title, String pub_year, String conferenceName, Location location, Period period) {
        super(title, pub_year);
        this.conferenceName = conferenceName;
        this.location = location;
        this.period = period;

    }
}