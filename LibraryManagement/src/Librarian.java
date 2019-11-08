import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Librarian extends JFrame implements ActionListener
{

    JFrame f;
    Container c,cnt;
    JPanel jp;
    JButton jb,jb2,jb3,jb4,jb5,jb6,jb7;
    JButton jbb1,jbb2,jbb3;
    JInternalFrame subFrame;
    
    
    public Librarian() {
    f=new JFrame("Librarian");
    f.setVisible(true);
    f.setBounds(0,0,1920,1080);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    c=f.getContentPane();
    jp=new JPanel();
    c.add(jp);
    jp.setBounds(0,0,1920,1080);
    jp.setLayout(null);
    jp.setBackground(Color.cyan);
    
     subFrame = new JInternalFrame();
    subFrame.setBounds(20,150,1850,820);
    //subFrame.setUndecorated( true );
    subFrame.setVisible( true );
    BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)subFrame.getUI()).getNorthPane();
    subFrame.remove(titlePane);
    jp.add(subFrame);
    cnt=subFrame.getContentPane();
    cnt.setBackground(Color.GRAY);
   
    
    jb=new JButton("Home");
    jb2=new JButton("Book Catalog");
    jb3=new JButton("View Account");
    jb4=new JButton("Issue Book");
    jb5=new JButton("Return Book");
    jb6=new JButton("Search Catalog");
    jb7=new JButton("Log Out");
    jbb1=new JButton("Add Book");
    jbb2=new JButton("Update Book");
    jbb3=new JButton("Remove Book");
    
    Font text=new Font("Glyphic",Font.PLAIN,16);
    Font text1=new Font("Glyphic",Font.PLAIN,14);
    jb.setFont(text);
    jb2.setFont(text);
    jb3.setFont(text);
    jb4.setFont(text);
    jb5.setFont(text);
    jb6.setFont(text);
    jb7.setFont(text);
    jbb1.setFont(text1);
    jbb2.setFont(text1);
    jbb3.setFont(text1);
    
    jp.add(jb);
    jp.add(jb2);
    jp.add(jb3);
    jp.add(jb4);
    jp.add(jb5);
    jp.add(jb6);
    jp.add(jb7);
    jp.add(jbb1);
    jp.add(jbb2);
    jp.add(jbb3);
    
    int btnwth=200,btnheight=60;
    jb.setBounds(0,0,btnwth,btnheight);
    jb2.setBounds(200,0,btnwth,btnheight);
    jb3.setBounds(400,0,btnwth,btnheight);
    jb4.setBounds(600,0,btnwth,btnheight);
    jb5.setBounds(800,0,btnwth,btnheight);
    jb6.setBounds(1000,0,btnwth,btnheight);
    jb7.setBounds(1200,0,btnwth,btnheight);
    jbb1.setBounds(200,60,btnwth,btnheight/2);
    jbb2.setBounds(200,90,btnwth,btnheight/2);
    jbb3.setBounds(200,120,btnwth,btnheight/2);
    
    jbb1.setVisible(false);
    jbb2.setVisible(false);
    jbb3.setVisible(false);
    
    jb.addActionListener(this);
    jb2.addActionListener(this);
    jb3.addActionListener(this);
    jb4.addActionListener(this);
    jb5.addActionListener(this);
    jb6.addActionListener(this);
    jb7.addActionListener(this);
    jbb1.addActionListener(this);
    jbb2.addActionListener(this);
    jbb3.addActionListener(this);
    
    
    
    }
    
    public static void main(String[] args) {
        Librarian lb=new Librarian();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==jb)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
        }
        if(e.getSource()==jb2)
        {
             jbb1.setVisible(true);
             jbb2.setVisible(true);
             jbb3.setVisible(true);
        }
         if(e.getSource()==jb3)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
             if(e.getSource()==jb3)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
              ViewAccount ob=new ViewAccount();
              ob.sp.setVisible(true);
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);
        }
        }
          if(e.getSource()==jb4)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
            IssueBook ob=new IssueBook();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);
            
        }
           if(e.getSource()==jb5)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
             ReturnBook ob=new ReturnBook();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);
        }
            if(e.getSource()==jb6)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
              SearchCatalog ob=new SearchCatalog();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);
        }
             if(e.getSource()==jb7)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
            LoginPage ob=new LoginPage();
            ob.frame.setVisible(true);
            f.dispose();
            //cnt.add(ob.parentPanel);
        }
             
        if(e.getSource()==jbb1)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
            AddBook ob=new AddBook();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);  
        }
         if(e.getSource()==jbb2)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
            UpdateBook ob=new UpdateBook();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);  
        }
          if(e.getSource()==jbb3)
        {
             jbb1.setVisible(false);
             jbb2.setVisible(false);
             jbb3.setVisible(false);
             
            DeleteBook ob=new DeleteBook();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);  
        }
                     
    
    }

   
    
}