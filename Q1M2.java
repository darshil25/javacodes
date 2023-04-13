import java.awt.*;
public class Q1M2 extends Frame {
    Frame fm = new Frame();
    Label lb = new Label("Hello, VIT");

        Q1M2(){
            add(lb);
            setSize(100, 100);
            lb.setBounds(20, 30, 50, 60);
    }

    public static void main(String[] args) {
        Q1M2 fm = new Q1M2();
        fm.setVisible(true);
    }
}
