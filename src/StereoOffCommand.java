import definition.Stereo;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
