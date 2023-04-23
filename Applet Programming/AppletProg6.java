import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletProg6" width=500 height=600></applet> */

public class AppletProg6 extends Applet implements KeyListener {

    // Used to enter Single Line Text input
    TextArea ta1;
    // Used to take Paragraph Text Input ;_)
    TextField t;
    Label l;

    @Override
    public void init() {
        l=new Label("Enter Something");
        t=new TextField(20);
        t.addKeyListener(this);
        ta1=new TextArea(100,70);
        // Disables the TextArea UnEditable ;)
        ta1.setEditable(false);

        add(l);
        add(t);
        add(ta1);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta1.append("Key Typed:"+e.getKeyCode()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // getKeyCode gives the respective ASCII Character...!!
        showStatus("You Typed "+e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta1.append("KeyPressed:"+e.getKeyChar()+"\n");
    }

    
}
