import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Librarian1 extends JFrame implements ActionListener
{

    JFrame f;
    Container c,cnt;
    JPanel jp;
    MenuBar mb;
    Menu m1,m2,m3,m4,m5,m6,m7;
    MenuItem m21,m22,m23;
    JInternalFrame subFrame;
    JButton btn;
    
    
    public Librarian1() {
    f=new JFrame("Librarian");
    f.setBounds(0,0,1920,1080);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Font text=new Font("Glyphic",Font.BOLD,18);
    c=f.getContentPane();
    jp=new JPanel();
    c.add(jp);
    jp.setBounds(0,0,1920,1080);
    jp.setLayout(null);
    jp.setBackground(Color.cyan);
    mb=new MenuBar();
    f.setMenuBar(mb);
    mb.setFont(text);
    subFrame = new JInternalFrame();
    subFrame.setBounds(20,110,1850,820);
    //subFrame.setUndecorated( true );
    subFrame.setVisible( true );
    BasicInternalFrameTitlePane titlePane =(BasicInternalFrameTitlePane)((BasicInternalFrameUI)subFrame.getUI()).getNorthPane();
    subFrame.remove(titlePane);
    c.add(subFrame);
    cnt=subFrame.getContentPane();
    cnt.setBackground(Color.GRAY);
    
    
		m1=new Menu("Home    ");
		m2=new Menu("Book Catalog     ");
		m3=new Menu("Issue Book     ");
		m4=new Menu("Return Book    ");
		m5=new Menu("Search Catalog     ");
		m6=new Menu("Fine");
		m7=new Menu("Log Out");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		mb.add(m6);
                mb.add(m7);
                
                m21=new MenuItem("Add Book");
		m22=new MenuItem("Update Book");
		m23=new MenuItem("Delete Book");

		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
   
   
                btn=new JButton("Logout");
                btn.setBounds(1700,50,100,30);
                jp.add(btn);
                btn.addActionListener(this);
    
    int btnwth=240,btnheight=40;
    
    m1.addActionListener(this);
    m3.addActionListener(this);
    m4.addActionListener(this);
    m5.addActionListener(this);
    m6.addActionListener(this);
    m7.addActionListener(this);
    m21.addActionListener(this);
    m22.addActionListener(this);
    m23.addActionListener(this);
      
      f.setVisible(true);
        //f.revalidate();
    }
    
    public static void main(String[] args) {
        Librarian1 lb=new Librarian1();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==m1)
        {
            
        }
        
        if(e.getSource()==m3)
        {
            
        }
        
        if(e.getSource()==m4)
        {
             
        }
        
        if(e.getSource()==m5)
        {
            
        }
        
        if(e.getSource()==m6)
        {
            
        }
        
        if(e.getSource()==m7)
        {
          
        }
         if(e.getSource()==btn)
        {
            LoginPage ob=new LoginPage();
            ob.frame.setVisible(false);
            cnt.add(ob.parentPanel);
            //this.dispose();
        }
        
        if(e.getSource()==m21)
        {
            
        }
        
        if(e.getSource()==m22)
        {
            
        }
        
        if(e.getSource()==m23)
        {
            
        }
        
        
    }

   
    
}