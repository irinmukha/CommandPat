/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 17.12.13
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
