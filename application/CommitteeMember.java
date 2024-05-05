//Written by Aliilani McGuire
package application;

public class CommitteeMember{
    public String fn, ln, education_background;

    public CommitteeMember() {
        fn="N/A";
        ln="N/A";
        education_background = "N/A";
    }
    public CommitteeMember(String fn, String ln, String eb) {
        this.fn = fn;
        this.ln = ln;
        education_background = eb;
    }
}