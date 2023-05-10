import java.awt.*;
import java.awt.event.*;
public class LanguageChoose extends Frame implements ActionListener{
    private Label lb;
    private Choice ch;
    private Button bt;

LanguageChoose(){
    setLayout(new FlowLayout());
    setSize(600, 600);
    Label lb = new Label("Enter fav Language :");
    add(lb);
    Choice ch = new Choice();
    ch.add("JAVA");
    ch.add("Python");
    ch.add("C++");
    add(ch);
    Button bt = new Button("Select");
    bt.addActionListener(this);
    add(bt);
    setVisible(true);
}

public void actionPerformed(ActionEvent e){
    if(e.getSource() == bt){
        String lan = ch.getSelectedItem();
        String out = ("Selected lang is : " + lan);
        lb.setText(out);
    }
}

public static void main(String[] args) {
    LanguageChoose fm = new LanguageChoose();
}
}
