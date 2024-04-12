//Written by Aliilani McGuire

package application;

public class ResearchReport extends Publication {
    public Author[] author_list;

    public ResearchReport() {
        super();
        author_list = new Author[0];
    }
    public ResearchReport(String t, String py, int an) {
        super(t, py);
        author_list = new Author[an];
    }
}