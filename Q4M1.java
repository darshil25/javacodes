import java.awt.*;
public class Q4M1 {
    public static void main(String[] args) {
        Frame fm = new Frame();
        fm.setSize(600, 600);
        Label lb = new Label("Choose your favorite programming language:");
        fm.add(lb);
        lb.setBounds(20, 100, 500, 30);
        Checkbox ck = new Checkbox("JAVA");
        ck.setBounds(20, 130, 100, 30);
        fm.add(ck);
        Checkbox ck1 = new Checkbox("PYTHON");
        ck1.setBounds(20, 160, 100, 30);
        fm.add(ck1);
        Checkbox ck2 = new Checkbox("C/C++");
        ck2.setBounds(20, 190, 100, 30);
        fm.add(ck2);
        Checkbox ck3 = new Checkbox("C#");
        ck3.setBounds(20, 210, 100, 30);
        fm.add(ck3);
        RadioButton rb = new RadioButton();
        

        fm.setLayout(null);
        fm.setVisible(true);
    }
}
