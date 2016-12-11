package command.concreteCommand;

import command.command.Command;
import command.receiver.Television;

/**
 * Created by XY on 2016/11/20.
 */
public class OpenTvCommand implements Command {
    private Television television;

    public OpenTvCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.open();
    }
}
