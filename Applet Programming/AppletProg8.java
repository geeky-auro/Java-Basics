import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletProg8 extends Frame {

    Label l1;
    Checkbox c1,c2,c3,c4;
    String s="U Selected";

    public AppletProg8(){
        setLayout(new FlowLayout()); // ACts as LinearLayout in Android ;)
        l1=new Label();
        c1=new Checkbox("Windows XP",true);
        c2=new Checkbox("Windows NT 200");
        c3=new Checkbox("Mac");
        c4=new Checkbox("Solaris");
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);

        setTitle("APplication Form");
        setSize(200,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppletProg8();
    }
    
}
