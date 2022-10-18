package Memento;

import javax.swing.JTextPane;

public class Originator extends JTextPane{
    public void  restore(Memento m){
        this.setText(m.getText());
    }

    public Memento snapshot(){
        return new Memento(this.getText());
    }

}
