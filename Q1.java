import java.awt.*;
import java.awt.event.*;

public class Q1 extends Frame implements MouseListener{
    Label lb;
    
    Q1() {
        addMouseListener(this);

        lb = new Label();
        lb.setBounds(20, 50, 100, 100);
        add(lb);
        setSize(700, 500);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e){
        lb.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e){
        lb.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        lb.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        lb.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        lb.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new Q1();
    }
}