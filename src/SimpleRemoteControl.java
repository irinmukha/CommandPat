/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
