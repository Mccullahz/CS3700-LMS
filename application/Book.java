package application;
//Kala

public class Book extends Publication{
    public String title, pubYear;
    public int authNum;
    public Publisher publisher;
    public Chapters chap;
    public Figures fig;
    private int edNum;

    public Book(){
        super();
        publisher = new Publisher();
        chap = new Chapters();
        fig = new Figures();
        setEdNum(1);
    }

    public Book(String title, String pubYear, int authNum, String fName, String lName, int chapCount, int pageCount, int numFigs, int edNum){
        super(title, pubYear, authNum);
        publisher = new Publisher(fName, lName);
        chap = new Chapters(chapCount, pageCount);
        fig = new Figures(numFigs);
        setEdNum(edNum);
    }


    public void setEdNum(int num){ if(num >=1){ edNum = num; } }
    public int getEdNum(){return edNum;}

}
