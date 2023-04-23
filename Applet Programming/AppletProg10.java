import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletProg10 extends Frame implements ItemListener {

    String message="";
    CheckboxGroup cbg;
    Checkbox c1,c2,c3,c4;
    TextField tf; 

    public AppletProg10(){
        setLayout(new FlowLayout());
        tf = new TextField(30);
        cbg=new CheckboxGroup();
        c1=new Checkbox("Red",cbg,true);
        c2=new Checkbox("Green",cbg,false);
        c3=new Checkbox("Yellow",cbg,false);
        c4=new Checkbox("Pink",cbg,false);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(tf);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        setTitle("CheckBoxGroup Example");
        setVisible(true);
        setSize(400,700);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(cbg.getSelectedCheckbox()==c1){
            setBackground(Color.RED);
        }else if(cbg.getSelectedCheckbox()==c2){
            setBackground(Color.GREEN);
        }else if(cbg.getSelectedCheckbox()==c3){
            setBackground(Color.YELLOW);
        }else if(cbg.getSelectedCheckbox()==c4){
            setBackground(Color.PINK);
        }
    }

    public static void main(String[] args) {
        new AppletProg10();
    }
}
