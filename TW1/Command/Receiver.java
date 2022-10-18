package Command;

import Main.G2TextEditor;

public class Receiver{

    public void setBold() {
        G2TextEditor.bold_btn.doClick();
    }

    public void setFontColor() {
        G2TextEditor.fontcolor_btn.doClick();
    }

    public void setUnderLine(){
        G2TextEditor.underline_btn.doClick();
    }

    public void Undo(){
        G2TextEditor.undo_btn.doClick();
    }
    
    public void Redo(){
        G2TextEditor.redo_btn.doClick();
    }
}
