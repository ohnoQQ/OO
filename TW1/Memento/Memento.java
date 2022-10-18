package Memento;


public class Memento{
    private String textstates;
    
    public Memento(String textState){
        this.textstates=textState;
    }

    public String getText(){
        return textstates;
    }
}