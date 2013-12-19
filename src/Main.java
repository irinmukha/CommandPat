import definition.GarageDoor;
import definition.Light;
import definition.Stereo;
import definition.TV;

public class Main {

    public static void main(String[] args) {
	    RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenRoomLight = new Light("Kitchen room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo =  new Stereo();
        TV tv  = new TV("Living room");

        LightOnCommand livimgRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv) ;

        Command[] partyOn = {livimgRoomLightOnCommand, stereoOnWithCdCommand, tvOnCommand};
        Command[] partyOff = {livingRoomLightOffCommand, stereoOffCommand, tvOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
       /* remoteControl.setCommand(1, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);
*/
        System.out.println(remoteControl);
        System.out.println("----Pushing Macro ON------");
        remoteControl.onButtonWasPressed(0);

        System.out.println("----Pushing Macro OFF------");
        remoteControl.offButtonWasPressed(0);
        /*remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPreessed();
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);*/

    }
}
