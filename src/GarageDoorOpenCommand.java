import definition.GarageDoor;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor = new GarageDoor();
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    public void setGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.ligthOn();
    }

    @Override
    public void undo() {

        garageDoor.ligthOff();
        garageDoor.down();
    }
}
