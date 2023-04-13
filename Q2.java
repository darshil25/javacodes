import java.awt.*;
import java.awt.event.*;

public class Q2 extends Frame implements KeyListener{
    Label lb;
    TextArea tx;

    Q2(){
        lb=new Label();
        lb.setBounds(20,50,100,20);
        add(lb);
        tx=new TextArea();
        tx.setBounds(20,100,600, 350);
        add(tx);
        tx.addKeyListener(this);

        setSize(700,500);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        lb.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        lb.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        lb.setText("Key Typed");
    }

    public static void main(String[] args) {
        new Q2();
    }
}
