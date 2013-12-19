import definition.Light;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:57
 * To change this template use File | Settings | File Templates.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
