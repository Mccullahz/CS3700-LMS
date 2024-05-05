package application;

public class Chapters {
    private int chapCount;

    public Chapters(){
        chapCount = 5;
    }

    public Chapters(int cC){
        setChapCount(cC);
    }

    public void setChapCount(int num){
        if (num >= 1){ 
            chapCount = num;
        } 
    }
    
    public int getChapCount(){
        return chapCount;
    }
}
