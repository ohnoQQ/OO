package Command;


public class CommandInvoker {
    Command command;

    public CommandInvoker(){}

    public void execute(Command cmd){
        this.command=cmd;
    }
}
