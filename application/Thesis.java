package application;

//Cherico Welch
public class Thesis extends Publication{
    public Department department;
    public CommitteeMember[] committeeMembers;
    private Chapters chapters;
    private Figures figures;

    public Thesis(){
        department = new Department();
        committeeMembers = new CommitteeMember[0];
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