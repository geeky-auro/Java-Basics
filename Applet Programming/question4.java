import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="question4" width=500 height=600></applet> */

public class question4 extends Applet implements ActionListener {
    Label l;
    TextField t;
    Button btn;

    @Override
    public void init() {
          l=new Label("");  
          t=new TextField(50);
          add(l);
          add(t);
          btn=new Button("Calculate");
          btn.addActionListener(this);
          add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            int n=Integer.parseInt(t.getText());
            if(n%2==0){
                l.setText("Even");
            }else{
                l.setText("Odd");
            }
        }
    }


}
