/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0; i <7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public  void onButtonWasPressed(int  slot){
        if(onCommands[slot] != null){
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public  void undoButtonWasPreessed(){
        undoCommand.undo();
    }
    @Override
    public String toString() {
       StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----Remote Control-----\n");
        for (int i =0; i<onCommands.length; i++)
            stringBuffer.append(/*"OnCommand").append(i);*/
            stringBuffer.append("[slot ").append(i).append("]").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n"));
        return stringBuffer.toString();
    }
}

