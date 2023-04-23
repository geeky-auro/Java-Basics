import java.awt.*;
import java.applet.*;

// AWT -> Abstract WIndow ToolKit ;)

/* 
    <applet code="AppletProg2" width=500 height=300 ></applet>
*/

public class AppletProg2 extends Applet {

    int count=0;

    @Override
    public void init() {
        super.init();
        System.out.println("init");

    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void paint(Graphics g){
//         Most of the graphics operations in Java are methods defined in the Graphics class
        setBackground(Color.YELLOW);
        g.drawString("Hello World!",50,50);
        showStatus("Applet Status!");
        System.out.println("Paint is Called Once "+count++);
        // g.drawString(((Integer)incrementCounter()).toString(),30,40);
    }

@Override
public void stop() {
    System.out.println("Stop");
}

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

}
