import definition.GarageDoor;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoorCloseCommand  implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

        garageDoor.ligthOff();
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.ligthOn();
        garageDoor.up();
    }
}
