import java.awt.*;
public class Q2M2 extends Frame{
    Frame fm = new Frame();
        TextField lb = new TextField();
        TextField lb2 = new TextField();
        Button bt = new Button("Hi");

    Q2M2(){
        add(lb);
        add(lb2);
        add(bt);
        setSize(600, 600);
        lb.setBounds(20, 30, 100, 30);
        lb2.setBounds(20, 110, 100, 30);
        bt.setBounds(20, 150, 80, 30);
    }

    public static void main(String[] args) {
        Q2M2 fm = new Q2M2();
        fm.setLayout(null);
        fm.setVisible(true);
    }
}
