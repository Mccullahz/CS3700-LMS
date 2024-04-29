package application;

//Patrick Siegler
public class Dissertation extends Publication{
    
    private Department department;
    private CommitteeMember[] committeeMembers;
    private Chapters chapters;
    private Figures figures;

    public Dissertation(){
        department = new Department();
        committeeMembers = new CommitteeMember[0];
        chapters = new Chapters();
        figures = new Figures();
    }

    public Dissertation(String title, String publicationYear, String departmentName, Department department, CommitteeMember[] committeeMembers, Chapters chapters, Figures figures){
        super(title, publicationYear, 1);
        this.department = department;
        this.committeeMembers = committeeMembers;
        this.chapters = chapters;
        this.figures = figures;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public CommitteeMember[] getCommitteeMembers() {
        return committeeMembers;
    }

    public void setCommitteeMembers(CommitteeMember[] committeeMembers) {
        this.committeeMembers = committeeMembers;
    }

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }
}
