import definition.TV;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 17.12.13
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChanel(1);
        tv.setVolume(12);
    }

    @Override
    public void undo() {
        tv.off();
    }
}
