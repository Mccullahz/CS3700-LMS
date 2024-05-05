package application;

//Cherico Welch
public class Thesis extends Publication {
    
    private Department department;
    public CommitteeMember[] committeeMember;
    private Chapters chapters;
    private Figures figures;
    
    public Thesis(){
        Department = new Department();
        committeeMember = new CommitteeMember[0];
        chapters = new Chapters();
        figures = new Figures();
    }

    public Thesis(String title, String publicationYear, Department department, int committeeMembersNum, Chapters chapters, Figures figures) {
        super(title, publicationYear, 1);
        this.department = department;
        committeeMembers = new CommitteeMember[committeeMembersNum];
        this.chapters = chapters;
        this.figures = figures;
    }

    public Department getDepartment(){
        return department;
    }

    public department setDepartment(Department department){
        return department;
    }

    public CommitteeMember [] getCommitteeMembers(){
        return CommitteeMembers;
    }

    public void setCommitteeMembers(CommitteeMember[] committeeMembers) {
        this.committeeMembers = committeeMembers;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapter) {
        this.chapters = chapter;
    }

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }
}