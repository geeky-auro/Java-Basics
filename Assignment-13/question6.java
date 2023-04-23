import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="question5" width=500 height=600></applet> */

public class question6 extends Applet implements ActionListener {
    TextField t1,t2,t3;
    Button add,sub;
    
    @Override
    public void init() {
        t1=new TextField(40);
        t2=new TextField(40);
        t3=new TextField(40);
        add(t1);
        add(t2);
        add(t3);
        t3.setEnabled(false);
        add=new Button("Add");
        sub=new Button("Substract");
        add.addActionListener(this);
        sub.addActionListener(this);
        add(add);
        add(sub);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(t1.getText().toString());
            int b=Integer.parseInt(t2.getText().toString());
        if(e.getSource()==add){
            t3.setText("Sum is "+(a+b));
        }else if(e.getSource()==sub){
            t3.setText("Difference is "+(a-b));
        }
    }


}
