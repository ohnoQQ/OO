package Command;


public class FontColorCommand implements Command{
    public Receiver receiver;

    public FontColorCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    public void execute() {
        receiver.setFontColor();
    }

    public void undo(){}
    public void redo(){}

}