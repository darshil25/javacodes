import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FakeShutdown {

    public static void main(String[] args) {

        // Create a new JFrame object
        JFrame frame = new JFrame("Display Image");

        // Create a new JLabel object to display the image
        JLabel label = new JLabel();
        label.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);

        // Load the image from file
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("C:/Users/Lenovo/Downloads/FakeU.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Scale the image to fit the size of the JLabel
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);

        // Set the image icon to display in the JLabel
        ImageIcon imageIcon = new ImageIcon(scaledImage);
        label.setIcon(imageIcon);

        // Add the JLabel to the JFrame
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Set the JFrame to full-screen mode
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        // Display the JFrame
        frame.setVisible(true);
    }
}
