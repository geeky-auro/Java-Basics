import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="AppletProg4" width=400 height=500> </applet> */
public class AppletProg4 extends Applet implements MouseListener{

    @Override
    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me){
            setBackground(Color.PINK);
            System.out.println(me.getX()+","+me.getY());
            System.out.println("MouseClicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         setBackground(Color.CYAN);
         System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.LIGHT_GRAY);
        System.out.println("MouseExited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.BLUE);
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.ORANGE);
        System.out.println("mouseReleased"); 
    }
    
}
