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
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
