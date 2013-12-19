package definition;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class Stereo {
    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCd(){
        System.out.println("Cd is set");
    }
    public  void setVolume(int vol){
        System.out.println("Volume is" + " " + String.valueOf(vol));

    }
}
