import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AppletProg9 extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3,c4;
    TextArea ta;
    public AppletProg9(){ //init
        setLayout(new FlowLayout()); //LinearLayout
        l=new Label("Your Favourite Flavours:");
        c1=new Checkbox("Vanilla",true);
        c2=new Checkbox("Chocolate");
        c3=new Checkbox("Straberry");
        c4=new Checkbox("ButterScotch");
        ta=new TextArea(10,30);
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(ta);
        /* Handling Events in CheckBox */
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);


        /* Setting up the Frame */
        setTitle("CheckBox Example");
        setSize(400,700);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                dispose();
            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s="U Selected \n";
        if(c1.getState()){
            s=s+c1.getLabel();
        }
        if(c2.getState()){
            s=s+c2.getLabel();
        }
        if(c3.getState()){
            s=s+c3.getLabel();
        }
        if(c4.getState()){
            s=s+c4.getLabel();
        }
        
    }



    public static void main(String[] args) {
        new AppletProg9();
    }
}
