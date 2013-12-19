import definition.TV;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 17.12.13
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
        tv.setInputChanel(1);
        tv.setVolume(12);
    }
}
