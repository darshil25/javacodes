import java.awt.*;
public class Q3M1 {
    public static void main(String[] args) {
        Frame fm = new Frame();
        fm.setSize(600, 600);
        Label lb = new Label("Enter your name:");
        fm.add(lb);
        lb.setBounds(20, 100, 100, 30);
        TextField tf = new TextField();
        fm.add(tf);
        tf.setBounds(20, 150, 100, 30);
        fm.setLayout(null);
        fm.setVisible(true);
        
    }
}
