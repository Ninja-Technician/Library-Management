import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class AddBook extends JFrame implements ActionListener
{
    JLabel label1;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    JLabel pic;;
    JFrame frame;
    JPanel parentPanel;
    JButton submit;
    
    AddBook()
    {
        int width=550,height=100;
        
        frame=new JFrame();
       
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        
        parentPanel = new JPanel();
        frame.add(parentPanel);
        parentPanel.setLayout(null);
        parentPanel.setBounds(width,height,500,650);
        parentPanel.setBackground(Color.GREEN);
      
        JPanel p = new JPanel();
        parentPanel.add(p);
        p.setLayout(null);
        p.setBounds(0,50,500,600);
        p.setBackground(Color.RED);
        
        
        
        Font text=new Font("Glyphic",Font.PLAIN,16);
        Color col = new Color(255,212,169);
        
        // Adding components into the Pannel
        
        lb1=new JLabel("ISBN");
        lb2=new JLabel("TITLE");
        lb3=new JLabel("AUTHOR");
        lb4=new JLabel("PRICE");
        lb5=new JLabel("PUBLISHER");
        lb6=new JLabel("LANGUAGE");
        lb7=new JLabel("EDITION");
        lb8=new JLabel("RACK NO.");
        submit=new JButton("SUBMIT");
        
        tx1=new JTextField();
        tx2=new JTextField();
        tx3=new JTextField();
        tx4=new JTextField();
        tx5=new JTextField();
        tx6=new JTextField();
        tx7=new JTextField();
        tx8=new JTextField();
        
        p.add(lb1);
        p.add(lb2);
        p.add(lb3);
        p.add(lb4);
        p.add(lb5);
        p.add(lb6);
        p.add(lb7);
        p.add(lb8);
        p.add(submit);
        
        p.add(tx1);
        p.add(tx2);
        p.add(tx3);
        p.add(tx4);
        p.add(tx5);
        p.add(tx6);
        p.add(tx7);
        p.add(tx8);
        
        lb1.setBounds(40,20,80,30);
        tx1.setBounds(150,20,300,30);
        
         lb2.setBounds(40,80,80,30);
        tx2.setBounds(150,80,300,30);
        
         lb3.setBounds(40,140,80,30);
        tx3.setBounds(150,140,300,30);
        
         lb4.setBounds(40,200,80,30);
        tx4.setBounds(150,200,300,30);
        
         lb5.setBounds(40,260,80,30);
        tx5.setBounds(150,260,300,30);
        
         lb6.setBounds(40,320,80,30);
        tx6.setBounds(150,320,300,30);
        
         lb7.setBounds(40,380,80,30);
        tx7.setBounds(150,380,300,30);
        
         lb8.setBounds(40,440,80,30);
        tx8.setBounds(150,440,300,30);
        
        submit.setBounds(175,520,150,30);
        
        submit.addActionListener(this);
        
          
         frame.setVisible(true);
      //  frame.revalidate();
       
            
    }
    public static void main(String args[])
    {
        AddBook ob =new AddBook();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
