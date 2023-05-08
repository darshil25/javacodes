import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreenshotBackgroundApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true); // Make the frame undecorated
        JPanel panel = new BackgroundPanel();
        JButton button = new JButton("Take Screenshot and Set as Background");
        button.addActionListener(e -> {
            try {
                Robot robot = new Robot();
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                Rectangle screenRect = new Rectangle(screenSize);
                BufferedImage image = robot.createScreenCapture(screenRect);
                File file = File.createTempFile("screenshot", ".png");
                ImageIO.write(image, "png", file);
                panel.setBackgroundImage(file.getAbsolutePath());
            } catch (AWTException | IOException ex) {
                ex.printStackTrace();
            }
        });
        panel.add(button);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class BackgroundPanel extends JPanel {
    private String imagePath;

    public BackgroundPanel() {
        setOpaque(false); // Make the panel transparent
    }

    public void setBackgroundImage(String imagePath) {
        this.imagePath = imagePath;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagePath != null) {
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                Dimension size = getSize();
                Graphics2D g2 = (Graphics2D) g.create();
                g2.drawImage(image, 0, 0, size.width, size.height, null);
                g2.dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
