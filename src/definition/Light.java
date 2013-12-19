package definition;

/**
 * Created with IntelliJ IDEA.
 * User: Irin
 * Date: 15.12.13
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class Light {
    private String room;
    public Light(String where) {
        room = where;
    }

    public void on(){
        System.out.println(room + " " + "light is on");
    }
    public void off(){
        System.out.println(room + " " + "light is off");
    }
}
