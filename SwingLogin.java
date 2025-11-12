import javax.swing.*;

public class SwingLogin extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;

    public SwingLogin(String t){
        super(t);
        setLayout(null);
        l1=new JLabel();
        l2=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton();
        b2=new JButton();

        l1.setBounds(50,50,100,50);
        l2.setBounds(50,125,100,50);
        t1.setBounds(160,50,100,50);
        t2.setBounds(160,125,100,50);
        b1.setBounds(90,200,50,25);
        b2.setBounds(130,200,50,25);

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

