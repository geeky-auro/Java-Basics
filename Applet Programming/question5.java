import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="question5" width=500 height=500></applet> */

public class question5 extends Applet {
    
    @Override
    public void paint(Graphics g) {
        g.fillRoundRect(70,130,50,70,20,20);
        g.drawRoundRect(130,130,50,50,10,10);
        g.drawRect(40,50,150, 150);
        g.setColor(Color.orange);
        g.draw3DRect(50,50,50,70,true);
        g.fill3DRect(280,50,50,50,true);
    }
    

}
