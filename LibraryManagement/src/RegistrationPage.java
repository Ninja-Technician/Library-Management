import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegistrationPage extends JFrame implements ActionListener
{
    JLabel label1;
    JTextField fname,lname,roll,mob,email,pass,repass;
    JButton can,ok;
    JLabel pic;
    JFrame frame;
    
    RegistrationPage()
    {
        int width=550,height=100;
        
        frame=new JFrame();
       
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel p = new JPanel();
        frame.add(p);
        p.setLayout(null);
        p.setBounds(width,height,450,600);
        p.setBackground(Color.GREEN);
        
        Font text=new Font("Glyphic",Font.PLAIN,16);
        Color col = new Color(255,212,169);
        
        // Adding components into the Pannel
        
        ImageIcon logo=new ImageIcon("dummy.jpg");
        pic=new JLabel(logo);
        pic.setBounds(170,80,100,100);
        p.add(pic);
               
        label1=new JLabel("LIBRARY REGISTRATION");
        label1.setBounds(60,20,400,50);
        label1.setFont(new Font("Glyphic",Font.BOLD,30));
        p.add(label1);
        
        fname=new JTextField("First Name");
        fname.setBounds(60,220,150,30);
        fname.setFont(text);
        fname.setBackground(col);
        p.add(fname);
        
        lname=new JTextField("Last Name");
         lname.setBounds(230,220,150,30);
         lname.setFont(text);
         lname.setBackground(col);
        p.add(lname);
        
        roll=new JTextField("Roll Number");
        roll.setBounds(60,270,320,30);
        roll.setFont(text);
        roll.setBackground(col);
        p.add(roll);
       
         email=new JTextField("Email");
         email.setBounds(60,320,320,30);
         email.setFont(text);
         email.setBackground(col);
        p.add(email);
        
         mob=new JTextField("Mobile Number");
         mob.setBounds(60,370,320,30);
         mob.setFont(text);
         mob.setBackground(col);
        p.add(mob);
        
        pass=new JTextField("Password");
        pass.setBounds(60,420,320,30);
        pass.setFont(text);
        pass.setBackground(col);
        p.add(pass);
        
        repass=new JTextField("Confirm Password");
        repass.setBounds(60,470,320,30);
        repass.setFont(text);
        repass.setBackground(col);
        p.add(repass);
        
        can=new JButton("CANCEL");
        can.setBounds(80,520,120,30);
        can.setFont(new Font("Glyphic",Font.PLAIN,18));
        p.add(can);
        
        ok=new JButton("SUBMIT");
        ok.setBounds(240,520,120,30);
        ok.setFont(new Font("Glyphic",Font.PLAIN,18));
        p.add(ok);
        
        can.addActionListener(this);
        ok.addActionListener(this);
          
         frame.setVisible(true);
         frame.setResizable(false);
      //  frame.revalidate();
       
            
    }
     public static void main(String args[])
    {
        RegistrationPage ob =new RegistrationPage();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==can)
        {
             LoginPage ob=new LoginPage();
            ob.frame.setVisible(true);
            frame.dispose();
        }
        if(e.getSource()==ok)
        {
            String first,last,rolln,mobile,eml,pswrd,repswrd;
            first=fname.getText();
            last=fname.getText();
            rolln=fname.getText();
            mobile=fname.getText();
            eml=fname.getText();
            pswrd=fname.getText();
            repswrd=fname.getText();
            
        }
    }
}
