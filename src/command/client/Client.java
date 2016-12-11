package command.client;

import command.command.Command;
import command.concreteCommand.ChangeChannelCommand;
import command.concreteCommand.CloseTvCommand;
import command.concreteCommand.OpenTvCommand;
import command.invoker.Controller;

/**
 * Created by XY on 2016/11/20.
 */
public class Client {
    public static void main(String[] args) {
        Command openCommand, closeCommand, changeChannerCommand;
        openCommand = new OpenTvCommand();
        closeCommand = new CloseTvCommand();
        changeChannerCommand = new ChangeChannelCommand();
        Controller controller = new Controller(openCommand, closeCommand, changeChannerCommand);
        controller.open();
        controller.change();
        controller.close();
    }
}
