import definition.Light;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
