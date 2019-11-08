
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
public class LoginPage {
    public static void main(String args[])
    {
        DesignLoginPage ob =new DesignLoginPage();

        
    }
}*/
public class LoginPage extends JFrame implements ActionListener
{
    JLabel label1;
    JTextField uname,pass;
    JButton login,signup,forgot;
    JLabel pic,pic1;
    JRadioButton btn1,btn2;
    ButtonGroup g1;
    JFrame frame;
    JPanel parentPanel;
    
    LoginPage()
    {
        int width=510,loginY=100;
        
        frame=new JFrame();
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        
        parentPanel=new JPanel();
        parentPanel.setLayout(null);
        frame.add(parentPanel);
        parentPanel.setBounds(width,loginY,900,600);
       // design.setBackground(Color.BLUE);
        
        JPanel design = new JPanel();
        parentPanel.add(design);
        design.setBounds(0,0,450,600);
        design.setBackground(Color.BLUE);
      
        JPanel p = new JPanel();
        parentPanel.add(p);
        p.setLayout(null);
        p.setBounds(450,0,450,600);
        p.setBackground(Color.GREEN);
        
        Font text=new Font("Glyphic",Font.PLAIN,20);
        Color col = new Color(255,212,169);
        Color colLogin = new Color(11,13,4);
        Color colSignup = new Color(51,51,255);
        
        // Adding components into the Pannel
        
        ImageIcon logo=new ImageIcon("H:\\Library-Management\\LibraryManagement\\src\\image\\dummy.jpg");
        pic=new JLabel(logo);
        pic.setBounds(170,80,100,100);
        p.add(pic);
        
          
        ImageIcon myLogo=new ImageIcon("H:\\Library-Management\\LibraryManagement\\src\\image\\mylogo1.jpg");
        pic1=new JLabel(myLogo);
        pic1.setBounds(0,0,450,600);
        design.add(pic1);
               
        label1=new JLabel("LIBRARIAN LOG IN");
        label1.setBounds(60,20,400,50);
        label1.setFont(new Font("Glyphic",Font.BOLD,30));
        p.add(label1);
        
        uname=new JTextField("Username");
        uname.setBounds(60,220,320,40);
        uname.setFont(text);
        uname.setBackground(col);
        p.add(uname);
        
        pass=new JTextField("Password");
        pass.setBounds(60,280,320,40);
        pass.setFont(text);
        pass.setBackground(col);
        p.add(pass);
        
        btn1=new JRadioButton("Student");
         btn1.setBounds(100,350,120,30);
         btn1.setBackground(null);
         btn1.setFont(text);
         p.add(btn1);
         
          btn2=new JRadioButton("Librarian");
         btn2.setBounds(220,350,120,30);
         btn2.setBackground(null);
         btn2.setFont(text);
         p.add(btn2);
         
         g1=new ButtonGroup();
         g1.add(btn1);
         g1.add(btn2);
        
        btn2.setSelected(true);
         
        login=new JButton("LOGIN");
        login.setBounds(80,400,280,30);
        login.setFont(new Font("Glyphic",Font.PLAIN,18));
       // login.setBackground(colLogin);
        p.add(login);
        
        
        signup=new JButton("SIGN UP");
        signup.setBounds(40,470,160,30);
        signup.setFont(new Font("Glyphic",Font.PLAIN,16));
        //signup.setBackground(colSignup);
        p.add(signup);
        
        forgot=new JButton("TROUBLE LOGIN");
        forgot.setBounds(230,470,160,30);
        forgot.setFont(new Font("Glyphic",Font.PLAIN,16));
       // forgot.setBackground(colSignup);
        p.add(forgot);
        
        login.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        signup.addActionListener(this);
        forgot.addActionListener(this);
        
        frame.setVisible(true);
        //  p.validate();
       
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource()==login)
        {
            if(btn2.isSelected())
            {
                String username=uname.getText();
                String password=pass.getText();
                if((username.equals("admin"))&&(password.equals("admin")))
                {
                    Librarian ob=new Librarian();
                    ob.f.setVisible(true);
                    frame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Username or Passwor is wrong.");
                }
            }
            if(btn1.isSelected())
            {
                String username=uname.getText();
                String password=pass.getText();
                if((username.equals("raj"))&&(password.equals("123")))
                {
                    StudentPortal ob=new StudentPortal();
                    ob.frame.setVisible(true);
                    frame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "UnAuthorized User");
                }
            }
        }
         if(e.getSource()==signup)
        {
             if(btn1.isSelected())
             {
            RegistrationPage ob=new RegistrationPage();
            ob.frame.setVisible(true);
                    frame.dispose();
             }
        }
         if(e.getSource()==btn1)
        {
            label1.setText("STUDENT LOG IN");
        }
          if(e.getSource()==btn2)
        {
            label1.setText("LIBRARIAN LOG IN");
        }
           if(e.getSource()==forgot)
        {
            if(btn2.isSelected())
            {
                uname.setText("admin");
                pass.setText("admin");
            }
       
    }
    }
    
     public static void main(String args[])
    {
       LoginPage ob =new LoginPage();

        
    }
}
