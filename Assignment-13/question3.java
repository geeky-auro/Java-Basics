import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="question3" width=600 height=600></applet> */

public class question3 extends Applet implements ItemListener,ActionListener {
    TextField t;
    Label l;
    TextArea ta;
    Checkbox c1,c2,c3,c4;
    Checkbox c5,c6,c7,c8;
    CheckboxGroup cbg;
    Button submit;

    @Override
    public void init() {
        t=new TextField(50);
        l=new Label("Answer:");
        ta=new TextArea();
        c1=new Checkbox("PDC",true);
        c2=new Checkbox("COA",false);
        c3=new Checkbox("AFL",false);
        c4=new Checkbox("DBMS",false);
        cbg=new CheckboxGroup();
        c5=new Checkbox("CSE-02", cbg,true);
        c6=new Checkbox("CSE-03", cbg,false);
        c7=new Checkbox("CSE-04", cbg,false);
        c8=new Checkbox("CSE-05", cbg,false);

        add(t);
        add(l);
        
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(ta);
        submit=new Button("Submit");
        submit.addActionListener(this);
        add(submit);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(cbg.getSelectedCheckbox()==c4){
            setBackground(Color.RED);
        }else if(cbg.getSelectedCheckbox()==c5){
            setBackground(Color.GREEN);
        }else if(cbg.getSelectedCheckbox()==c6){
            setBackground(Color.YELLOW);
        }else if(cbg.getSelectedCheckbox()==c7){
            setBackground(Color.PINK);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==submit){
        ta.append("Something has been Changed in the Form");
     }   
    }  

}
