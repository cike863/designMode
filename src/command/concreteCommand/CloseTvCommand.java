package command.concreteCommand;

import command.command.Command;
import command.receiver.Television;

/**
 * Created by XY on 2016/11/20.
 */
public class CloseTvCommand implements Command {
    private Television television;

    public CloseTvCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.close();
    }
}
