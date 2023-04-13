import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends Frame implements ActionListener {

    TextField txt1;
    Label lbl;
    Label txt2;
    Button btn;

    Q4(){
        setSize(600,300);
        lbl=new Label("Enter a number: ");
        lbl.setBounds(20,40,100,30);
        add(lbl);

        txt1=new TextField();
        txt1.setBounds(20, 80, 100, 30);
        add(txt1);

        btn= new Button("Submit!");
        btn.setBounds(20, 130, 50, 30);
        add(btn);

        btn.addActionListener(this);

        txt2=new Label();
        txt2.setBounds(20, 170, 500, 30);
        add(txt2);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String str=txt1.getText();
        int n=Integer.parseInt(str);
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        txt2.setText("The factorial of the number you entered is: "+fact);
    }

    public static void main(String[] args) {
        Q4 f= new Q4();
    }

}