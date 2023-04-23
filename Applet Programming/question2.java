import java.applet.*;
import java.awt.*;

/* <applet code="question2" width=500 height=500></applet> */

public class question2 extends Applet {
    public void paint(Graphics g){
        // drawOval( int X, int Y, int width, int height )
        /**
         * This draws a circle or an oval that fits within the rectangle specified by the X, Y, width and height arguments. The oval is drawn inside a rectangle whose upper left hand corner is at (X, Y), and whose width and height are as specified.
         */
        g.drawOval(40,80,160,190);

        // Oval for eyes
        g.setColor(Color.RED);
        // fillOval(int x, int y, int width, int height)
        g.fillOval(120,120,20,20);
        g.fillOval(170,120,20,20);

        g.drawArc(130,180,50,20,180,180);
    }
}
