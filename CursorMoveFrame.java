import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CursorMoveFrame extends JFrame implements MouseMotionListener {
    JButton noButton;
    JLabel messageLabel;
    
    public CursorMoveFrame() {
        super("Cursor Move Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        noButton = new JButton("No");
        messageLabel = new JLabel();
        add(noButton);
        add(messageLabel);
        
        addMouseMotionListener(this);
        pack();
        setVisible(true);
    }
    
    public void mouseMoved(MouseEvent e) {
        Point p = e.getPoint();
        Rectangle r = noButton.getBounds();
        
        if (r.contains(p)) {
            int choice = JOptionPane.showOptionDialog(this, "Move to different axes?", "Cursor near No button", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            
            if (choice == JOptionPane.YES_OPTION) {
                messageLabel.setText("I knew it");
            }
        }
    }
    
    public void mouseDragged(MouseEvent e) {}
    
    public static void main(String[] args) {
        new CursorMoveFrame();
    }
}
