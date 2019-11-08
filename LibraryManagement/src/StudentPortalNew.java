
import java.awt.*;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;


public class StudentPortalNew {
    public static void main(String args[])
    {
         StudentPortalDesign1 ob= new StudentPortalDesign1();
        
    }
}
class StudentPortalDesign1 extends JFrame
{
   JLabel wlcm,title1,title2;
   JButton lgt;
    JLabel label1;
    JLabel name,roll,mob,email;
    JLabel pic;
    int item=3;
    JTable content;
    StudentPortalDesign1()
    {
        
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        Container c= frame.getContentPane();
        // brdr = new BorderLayout();
       // c.setBackground(Color.GREEN);
        //c.setLayout(brdr);
        
   
        
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
        
        // Left Pannel
        
        
        ImageIcon logo=new ImageIcon("H:\\Library-Management\\LibraryManagement\\src\\image\\dummy.jpg");
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
        
        
         // Data to be displayed in the JTable 
        String[][] data = { 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100" }, 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100"} 
        }; 
  
        // Column Names 
        String[] columnNames = { "Book Title", "Issue Date", "Return Date","Fine" }; 
  
        // Initializing the JTable 
        content = new JTable(data, columnNames); 
        content.setFont(new Font("Glyphic",Font.BOLD,20));
        content.setBounds(30, 40, 1000, 600); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(content); 
        table.add(content); 
        
        // Center Pannel , Table Pannel Ends here
        
        // Right Pannel
         title2=new JLabel("Fine");
        title2.setBounds(50,30,260,80);
        title2.setFont(new Font("Glyphic",Font.BOLD,56));
        right.add(title2);
        
        // Adding components into the Pannel
        /*
        ImageIcon logo=new ImageIcon("H:\\Library-Management\\LibraryManagement\\src\\image\\dummy.jpg");
        pic=new JLabel(logo);
        pic.setBounds(170,80,100,100);
        p.add(pic);
               */
        
            frame.revalidate();
    }
}
