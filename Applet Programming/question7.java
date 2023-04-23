import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="question7" width=500 height=600></applet> */

public class question7 extends Applet implements ActionListener{
    Button red,blue;
    @Override
    public void init() {
        red=new Button("Red");
        blue=new Button("Blue");
        red.addActionListener(this);
        blue.addActionListener(this);
        add(red);  
        add(blue);

    }
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if(arg0.getSource()==red){
                showStatus("You have pressed Red");
            }else{
                showStatus("You have pressed Blue");
            }
        }

}
