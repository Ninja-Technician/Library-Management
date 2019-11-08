import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class UpdateBook extends JFrame implements ActionListener
{
    
    JTextField tx1;
    JButton view;
    JPanel parentPanel;
    JFrame frame;
    
    UpdateBook()
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
        //parentPanel.setBackground(Color.ORANGE);
      
        JPanel p = new JPanel();
        parentPanel.add(p);
        p.setLayout(null);
        p.setBounds(0,50,400,600);
        p.setBackground(Color.BLUE);
        
        
        
        Font text=new Font("Glyphic",Font.PLAIN,16);
        Color col = new Color(255,212,169);
        
        // Adding components into the Pannel
        
        tx1=new JTextField("Enter Title of the Book");
        view=new JButton("View");
               
        p.add(tx1);
        p.add(view);
       
        tx1.setBounds(50,120,300,30);
         view.setBounds(125,170,150,30);
        
        view.addActionListener(this);
        
          
         frame.setVisible(true);
      //  frame.revalidate();
       
            
    }
    public static void main(String args[])
    {
        UpdateBook ob =new UpdateBook();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          AddBook ob=new AddBook();
          ob.frame.setVisible(false);
          parentPanel.setVisible(false);
          frame.add(ob.parentPanel);
          ob.submit.setText("EDIT");
    }
}
