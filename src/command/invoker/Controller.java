package command.invoker;

import command.command.Command;

/**
 * Created by XY on 2016/11/20.
 */
public class Controller {
    private Command openTvCommand;
    private Command closeTvCommand;
    private Command changeChannelCommand;

    public Controller(Command openTvCommand, Command closeTvCommand, Command changeChannelCommand) {
        this.openTvCommand = openTvCommand;
        this.closeTvCommand = closeTvCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void open(){
        this.openTvCommand.execute();
    }
    public void close(){
        this.closeTvCommand.execute();
    }
    public void change(){
        this.changeChannelCommand.execute();
    }
}
