import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.GraphicsDevice;
import java.awt.AWTException;
import java.awt.Window;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;


public class MyConsoleDemo
{
    public static void main(final String[] args) {
        try {
            final Robot robot = new Robot();
            final GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            final Rectangle screenRect = device.getDefaultConfiguration().getBounds();
            final BufferedImage image = robot.createScreenCapture(screenRect);
            final JLabel label = new JLabel(new ImageIcon(image));
            final JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(3);
            frame.getContentPane().add(label);
            frame.setUndecorated(true);
            device.setFullScreenWindow(frame);
            URL url = new URL("https://tenor.com/view/windows10-update-load-pc-will-restart-gif-16630213");
            Image gif = ImageIO.read(url);
            label.setIcon(new ImageIcon(gif));
        }
        catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}