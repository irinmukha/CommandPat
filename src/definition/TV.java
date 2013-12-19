package definition;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 17.12.13
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 */
public class TV {
    String room;
    public TV(String where) {
        room = where;
    }

    public void on(){
         System.out.println("TV is on in" + " " +room);
    }
    public void off(){
        System.out.println("TV is off"  + " " +room);
    }
    public void setInputChanel(int chanel){
        System.out.println("Chanel is" + " " + String.valueOf(chanel));
    }
    public void setVolume(int vol){
        System.out.println("Volume is" + " " + String.valueOf(vol));
    }
}

