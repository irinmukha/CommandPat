import definition.CeilingFan;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 16.12.13
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilinhFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilinhFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilinhFan.getSpeed();
        ceilinhFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilinhFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilinhFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilinhFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilinhFan.off();
        }
    }
}
