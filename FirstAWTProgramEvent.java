import java.awt.*;
import java.awt.event.*;

public class FirstAWTProgramEvent {
    public static void main(String[] args) {
        // Create window
        Frame frame = new Frame("My First AWT Program");

        // Create label
        Label label = new Label("Hello, World!");

        // Add label to window
        frame.add(label);
        // frame.setBackground(new Color(255,127,100));

        // Add event listener to window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set window size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}