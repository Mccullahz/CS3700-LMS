package application;

public class Chapters {
    private int chapCount, pageCount;

    public Chapters(){
        chapCount = 5;
        pageCount = 100;
    }

    public Chapters(int cC, int pC){
        setChapCount(cC);
        setPageCount(pC);
    }

    public void setChapCount(int num){
        if (num >= 1){ 
            chapCount = num;
        } 
    }
    public void setPageCount(int num){
        if(num>=1){ 
            pageCount = num;
        } 
    }
    
    public int getChapCount(){
        return chapCount;
    }
    public int getPageCount(){
        return pageCount;
    }
}
