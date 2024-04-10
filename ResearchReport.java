//Written by Aliilani McGuire

package bookstore;

public class ResearchReport extends Magazine {
    public Author[] author_list;

    public ResearchReport() {
        super();
        author_list = Author[0];
    }
    public ResearchReport(String t, String py, int an) {
        super(t, py);
        author_list = Author[an];
    }
}