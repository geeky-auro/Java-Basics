import java.applet.*;
import java.awt.*;
import java.awt.event.*;;

// <applet code="AppletProg3" width=400 height=500></applet>

public class AppletProg3 extends Applet implements ActionListener{

    Button btn;
    Button btn2;
    TextField password;
    TextField txtName;
    Label msg;

@Override
public void init() {
    Label lblName=new Label("Enter your Name");
    add(lblName);
    txtName=new TextField(40);
    add(txtName);
    add(new Label("Enter your Password"));
    password=new TextField(40);
    password.setEchoChar('*');
    add(password);
    btn=new Button("Submit");
    btn2=new Button("Reset");
    btn.addActionListener(this);
    btn2.addActionListener(this);
    add(btn);
    add(btn2);
    msg=new Label();
    add(msg);
}
@Override
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==btn){
        showStatus("Submitted Successfully");
        Font font=new Font("Helvetica",Font.ITALIC,13);
        msg.setFont(font);
        msg.setText(txtName.getText().toString()+"\n"+ password.getText().toString());
    }else{
        showStatus("TextField CLeared");
        txtName.setText("");
        password.setText("");
        
    }
}

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        setBackground(Color.MAGENTA);
    }

/**
* Button:Generates action Events when the button is pressed.
* Check box:Generates item events when the check box is selected or deselected.
* Choice:Generates item events when the choice is changed.
* List:Generates action events when an item is double-licked;generates events when an item is selected or deselected.
* Menu item: Generates action events when a menu item is selected; generates item events when a checkable menu item is selected or deselected.
* Window: Generates adjustment events when the scroll bar is manipulated.
*Text Components: Generates text events when the user enters a character,
* Window: Generates window events when a window is activated, closed, deactivate deiconified, iconified, opened, or quit.
 * 
 * 
*/

}
