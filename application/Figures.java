package application;

public class Figures {
    private int figCount;

    public Figures(){
        figCount = 0;
    }

    public Figures(int num){
        setFigures(num);
    }


    public void setFigures(int num){
        if (num >= 0){ 
            figCount = num; 
        } 
    }

    public int getFigures(){ return figCount; }

}
