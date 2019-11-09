
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StudentPortal extends JFrame implements ActionListener
{
   JLabel wlcm,title1,title2,title3,title4;
   JButton lgt;
    JLabel label1;
    JLabel name,roll,mob,email;
    JLabel pic;
    int item=3;
    JFrame frame;
    StudentPortal()
    {
        
        frame=new JFrame();
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        Container c= frame.getContentPane();
        
        JPanel top = new JPanel();
        c.add(top);
        top.setLayout(null);
        top.setBounds(0,0,1920,100);
        top.setSize(1920,100);
        top.setBackground(Color.BLUE);
        
       
         JPanel left = new JPanel();
        c.add(left);
        left.setLayout(null);
        left.setBounds(0,100,400,900);
        left.setBackground(Color.YELLOW);
        
         JPanel center = new JPanel();
        c.add(center);
        center.setLayout(null);
        center.setBounds(400,100,1220,900);
        center.setBackground(Color.ORANGE);
        
         JPanel right = new JPanel();
        c.add(right);
        right.setLayout(null);
        right.setBounds(1620,100,300,900);
        right.setBackground(Color.YELLOW);
        
       
        
        Font text=new Font("Glyphic",Font.BOLD,20);
        Color col = new Color(255,212,169);
        
        // Top Pannel
        wlcm=new JLabel("Welcome Sushant");
        wlcm.setBounds(60,20,400,50);
        wlcm.setFont(new Font("Glyphic",Font.BOLD,30));
        top.add(wlcm);
        
        lgt=new JButton("Logout");
        lgt.setBounds(1750,30,100,30);
        top.add(lgt);
        
        lgt.addActionListener(this);
        
        // Left Pannel
        
        
        ImageIcon logo=new ImageIcon("dummy.jpg");
        pic=new JLabel(logo);
        pic.setBounds(150,80,100,100);
        left.add(pic);
        
         name=new JLabel("Name : Sushant Sundi");
        name.setBounds(50,230,250,50);
        name.setFont(text);
        left.add(name);
        
         roll=new JLabel("Roll  : 16 - CSE - 3106");
        roll.setBounds(50,300,250,50);
        roll.setFont(text);
        left.add(roll);
        
         email=new JLabel("Email : surajsushant007@gmail.com");
        email.setBounds(50,370,350,50);
        email.setFont(text);
        left.add(email);
        
         name=new JLabel("Mob   : 8789957324");
        name.setBounds(50,440,250,50);
        name.setFont(text);
        left.add(name);
        
        // Center Pannel
        title1=new JLabel("Books Issued");
        title1.setBounds(50,30,800,80);
        title1.setFont(new Font("Glyphic",Font.BOLD,56));
        center.add(title1);
        
        // Table Pannel
         JPanel table = new JPanel();
        center.add(table);
        table.setLayout(null);
        table.setBounds(50,120,1120,700);
        table.setBackground(Color.GRAY);
        
        //Title Content Pannel
        JPanel titleContent = new JPanel();
        table.add(titleContent);
        titleContent.setLayout(null);
        titleContent.setBounds(0,30,1150,70);
        titleContent.setBackground(Color.BLUE);
        
        JLabel label1,label2,label3,label4,label5,label6,label7,label8;
        
        label1=new JLabel("Book Title");
        label1.setBounds(100, 20,300,50);
        label1.setFont(new Font("Glyphic",Font.PLAIN,24));
        titleContent.add(label1);
        
         label2=new JLabel("Issue Date");
        label2.setBounds(650, 20,150,50);
        label2.setFont(new Font("Glyphic",Font.PLAIN,24));
        titleContent.add(label2);
        
         label3=new JLabel("Return Date");
        label3.setBounds(800, 20,150,50);
        label3.setFont(new Font("Glyphic",Font.PLAIN,24));
        titleContent.add(label3);
        
          label7=new JLabel("Fine");
        label7.setBounds(970, 20,150,50);
        label7.setFont(new Font("Glyphic",Font.PLAIN,24));
        titleContent.add(label7);
        
        int x=0;
        for(int i=1;i<=item;i++)
        {
        JPanel content = new JPanel();
        table.add(content);
        content.setLayout(null);
        content.setBounds(20,x=x+130,1080,100);
        content.setBackground(Color.GREEN);
        
        label4=new JLabel("TextBook Of Mathematics - III");
        label4.setBounds(100, 20,300,50);
        label4.setFont(new Font("Glyphic",Font.BOLD,20));
        content.add(label4);
        
         label5=new JLabel("11/7/2019");
        label5.setBounds(650, 20,150,50);
        label5.setFont(new Font("Glyphic",Font.BOLD,20));
        content.add(label5);
        
         label6=new JLabel("26/7/2019");
        label6.setBounds(800, 20,150,50);
        label6.setFont(new Font("Glyphic",Font.BOLD,20));
        content.add(label6);
        
        label8=new JLabel("Rs. 100");
        label8.setBounds(950, 20,150,50);
        label8.setFont(new Font("Glyphic",Font.BOLD,20));
        content.add(label8);
        }
        // For Loop Ends
        
        // Center Pannel , Table Pannel Ends here
        
        // Right Pannel
         title2=new JLabel("Fine");
        title2.setBounds(50,30,260,80);
        title2.setFont(new Font("Glyphic",Font.BOLD,56));
        right.add(title2);
        
         title3=new JLabel("Payable Amount");
        title3.setBounds(20,700,260,80);
        title3.setFont(new Font("Glyphic",Font.BOLD,30));
        right.add(title3);
        
         title4=new JLabel("Rs. 300");
        title4.setBounds(100,750,150,80);
        title4.setFont(new Font("Glyphic",Font.BOLD,40));
        right.add(title4);
        
        
            frame.setVisible(true);
            frame.setResizable(false);
    }
    public static void main(String args[])
    {
         StudentPortal ob= new StudentPortal();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==lgt)
        {
            LoginPage ob=new LoginPage();
            ob.frame.setVisible(true);
            frame.dispose();
        }
    }
}
