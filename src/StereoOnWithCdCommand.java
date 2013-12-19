import definition.Stereo;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */
public class StereoOnWithCdCommand implements Command {
    Stereo  stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
         stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
    @Override
    public void undo() {
        stereo.off();
    }
}
