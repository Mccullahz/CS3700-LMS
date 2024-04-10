//Written by Aliilani McGuire

package bookstore;

public class JournalPaper extends ResearchReport {
    public String journal_title;

    public JournalPaper() {
        super();
        journal_title = "N/A";
    }
    public JournalPaper(String t, String py, int an, String jt) {
        super(t, py, jt);
        journal_title = jt;
    }
}