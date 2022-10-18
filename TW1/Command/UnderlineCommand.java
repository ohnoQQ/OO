package Command;

public class UnderlineCommand implements Command{
    public Receiver receiver;

    public UnderlineCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    public void execute() {
        receiver.setUnderLine();
    }

    public void undo(){}
    public void redo(){}
}
