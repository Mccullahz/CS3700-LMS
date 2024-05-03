package application;
//Cherico Welch
public class Thesis extends Published {
    
    private Department department;
    private CommitteeMember[] committeeMember;
    private Chapters chapters;
    private Figures figures;
    
    public Thesis(){
        Department = new Department();
        committeeMember = CommitteeMember();
        chapters = new Chapters();
        figures = new Figures();
    }

    public Dissertation(String title, String publicationYear, String departmentName, DeparmentName, Department department, committeeMember[] committeeMembers, Chapters chapters, Figures figures){
        super(title, publicationYear, 1);
        this.department = department;
        this.committeeMembers = committeeMembers;
        this.chapters = chapters;
        this.figures = figures;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department){
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
        this.chapters = chapters;
    }

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }
}
   

