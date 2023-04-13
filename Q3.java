import java.awt.*;
import java.awt.event.*;

public class Q3 extends Frame implements ActionListener {
    Label lb1, lb2;
    TextField tx;
    Button bt;

    public Q3() {
        //setLayout(new FlowLayout());

        setSize(500, 500);

        lb1 = new Label("Enter a String : ");
        lb1.setBounds(20, 100, 100, 30);
        add(lb1);

        tx = new TextField( 20);
        tx.setBounds(20, 130, 100, 30);
        add(tx);

        bt = new Button("Calculate length");
        bt.setBounds(20, 160, 100, 30);
        add(bt);
        bt.addActionListener(this);

        lb2 = new Label();
        add(lb2);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String str = tx.getText();
        lb2.setText("The length of the string you entered is: "+str.length());
    }

    public static void main(String[] args) {
        Q3 d = new Q3();
    }
}