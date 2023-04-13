import java.awt.*;
public class Q3M2 extends Frame{
    Frame fm = new Frame();
    Label lb = new Label("Enter your name:");
    TextField tf = new TextField();

Q3M2(){
    add(lb);
    add(tf);
    setSize(600, 600);
    lb.setBounds(20, 100, 100, 30);
    tf.setBounds(20, 150, 100, 30);
}

public static void main(String[] args) {
    Q3M2 fm = new Q3M2();
        fm.setLayout(null);
        fm.setVisible(true);
}
}
