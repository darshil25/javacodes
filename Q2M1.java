import java.awt.*;
public class Q2M1 {
    public static void main(String[] args) {
        Frame fm = new Frame();
        TextField lb = new TextField();
        TextField lb2 = new TextField();
        Button bt = new Button("Hi");
        fm.add(lb);
        fm.add(lb2);
        fm.add(bt);
        fm.setSize(600, 600);
        lb.setBounds(20, 30, 100, 30);
        lb2.setBounds(20, 110, 100, 30);
        bt.setBounds(20, 150, 80, 30);
        fm.setLayout(null);
        fm.setVisible(true);
        }
    }
