import java.awt.*;
import java.awt.event.*;


class LoginPage extends Frame implements ActionListener {
    Label l1, l2, msg;
    TextField t1, t2;
    Button b1, b2;

    LoginPage() {
        setTitle("Login Page");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2, 10, 10));
        setBackground(Color.LIGHT_GRAY);

        l1 = new Label("Username:");
        l2 = new Label("Password:");
        t1 = new TextField();
        t2 = new TextField();
        t2.setEchoChar('*');
        b1 = new Button("Login");
        b2 = new Button("Clear");

        msg = new Label("");
        msg.setForeground(Color.BLUE);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(msg);

        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = t1.getText();
        String pass = t2.getText();

        if (e.getSource() == b1) { 
            if (user.equals("admin") && pass.equals("12345")) {
                msg.setText("Login Successful!");
                msg.setForeground(Color.GREEN);
            } else {
                msg.setText("Invalid username or password!");
                msg.setForeground(Color.RED);
            }
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            msg.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
