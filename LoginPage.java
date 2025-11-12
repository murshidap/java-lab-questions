import java.awt.*;


class LoginPage extends Frame 
{
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;

    LoginPage(String t) 
    {
        super(t);
        setLayout(null);
        l1 = new Label("Username:");
        l2 = new Label("Password:");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Login");
        b2 = new Button("Clear");

        l1.setBounds(100,100,50,25);
        l2.setBounds(100,150,50,25);
        t1.setBounds(160,100,100,25);
        t2.setBounds(160,150,100,25);
        b1.setBounds(125, 200, 50, 25);
        b2.setBounds(155, 200, 50, 25);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

    }
    public static void main(String arg[])
    {
        LoginPage l=new LoginPage("Login Page");
        l.setSize(350,200);
        l.setVisible(true); 
    }
}