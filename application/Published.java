package application;
//Kala :D

public class Published {
    public Author[] author_list;
    public String title, pub_year;

    public Published() {
        title = "N/A";
        pub_year = "1969";
        author_list = new Author[0];
    }

    public Published(String title, String py, int authNum){
        this.title = title;
        pub_year = py;
        author_list = new Author[authNum];
    }

    public Published(String title, String py){
        this.title = title;
        pub_year=py;
    }
}
