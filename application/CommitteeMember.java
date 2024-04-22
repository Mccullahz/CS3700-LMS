//Written by Aliilani McGuire
package application;

public class CommitteeMember extends Author {
    public String education_background;

    public CommitteeMember() {
        super();
        education_background = "N/A";
    }
    public CommitteeMember(String fn, String ln, String eb) {
        super(fn,ln);
        education_background = eb;
    }
}