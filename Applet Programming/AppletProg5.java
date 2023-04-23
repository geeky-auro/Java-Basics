import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=AppletProg5 width=400 height=500></applet> */

public class AppletProg5 extends Applet implements MouseMotionListener{
    
        @Override
        public void init() {
            // Registering the EVentsListener
            addMouseMotionListener(this);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        setBackground(Color.ORANGE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
        setBackground(Color.BLACK);
        Graphics g=getGraphics();
        g.setColor(Color.RED);
        g.drawRect(e.getX(), e.getY(), 200,200);
        // Internally doesnt Repeat the Event instead clears everytime a new entry is called ;)
        // Clear the Canvas
        repaint();
        }

}
