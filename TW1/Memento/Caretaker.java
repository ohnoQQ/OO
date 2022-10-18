package Memento;


import java.util.ArrayList;
import java.util.List;

public class Caeataker {
    public Originator originator;
    private List<Memento> m=new ArrayList<Memento>();
    private int curPos=0;

    public void addMemento(Memento memento) {
        if(curPos != m.size() && curPos>0){
            m=m.subList(0,curPos);
        }
        System.out.println(curPos);
        m.add(memento);
        curPos=m.size();
    }

    public Memento getMemento() {
        return m.get(curPos);
    }

    public Memento undo(){
        curPos=Math.max(0,curPos-2)+1;
        Memento undoMemento=m.get(curPos=1);
        return undoMemento;
    }

    public Memento redo() {
        curPos=Math.min(m.size(),curPos+1);
        Memento redoMemento=m.get(curPos-1);
        return redoMemento;
    }
}
