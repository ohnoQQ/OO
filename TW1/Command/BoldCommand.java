package Command;


public class BoldCommand implements Command{
    public Receiver receiver;

    public BoldCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    public void execute() {
        receiver.setBold();
    }

    public void undo(){}
    public void redo(){}

}

