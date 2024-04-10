//Written by Aliilani McGuire

public class CommitteeMember extends Author {
    public String committee_name;

    public CommitteeMember() {
        super();
        committee_mem_name = "N/A";
    }
    public CommitteeMember(String fn, String ln, String cn) {
        super(fn,ln);
        committee_name = cn;
    }
}