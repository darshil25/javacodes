import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LAB5 extends Frame implements ActionListener {
    private TextField noField, nameField, ageField, stateField;
    private Button addButton, updateButton, deleteButton;
    private Label messageLabel;
    private Connection connection;

    public LAB5() {
        super("Student Detail Database");

        noField = new TextField(20);
        nameField = new TextField(20);
        ageField = new TextField(20);
        stateField = new TextField(20);

        addButton = new Button("Add");
        addButton.addActionListener(this);
        updateButton = new Button("Update");
        updateButton.addActionListener(this);
        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);


        messageLabel = new Label("");

        setLayout(new GridLayout(4, 2));
        add(new Label("No:"));
        add(noField);
        add(new Label("Name:"));
        add(nameField);
        add(new Label("Age:"));
        add(ageField);
        add(new Label("State:"));
        add(stateField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(messageLabel);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab5", "root", "");
        } catch (Exception ex) {
            messageLabel.setText("Error connecting to database: " + ex.getMessage());
        }

        setSize(700, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Statement statement = connection.createStatement();
            int no = Integer.parseInt(noField.getText());
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String state = stateField.getText();

            if (e.getSource() == addButton) {
                statement.executeUpdate("INSERT INTO name (no, name, age, state) VALUES (" + no + ", '" + name + "', " + age + ", '" + state + "')");
                messageLabel.setText("Record added");
            } else if (e.getSource() == updateButton) {
                statement.executeUpdate("UPDATE name SET name = '" + name + "', age = " + age + ", state = '" + state + "' WHERE no = " + no);
                messageLabel.setText("Record updated");
            } else if (e.getSource() == deleteButton) {
                statement.executeUpdate("DELETE FROM name WHERE no = " + no);
                messageLabel.setText("Record deleted");
            }
            
        } catch (Exception ex) {
            messageLabel.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new LAB5();
    }
}