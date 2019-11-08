import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DeleteBook extends AddBook implements ActionListener
{
    
    JTextField tx1;
    JButton view;
    JPanel parentPanel;
    JFrame frame;
    
    DeleteBook()
    {
        int width=550,height=100;
        
        frame=new JFrame();
       
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        UpdateBook ob =new UpdateBook();
       
            
    }
    public static void main(String args[])
    {
        UpdateBook ob =new UpdateBook();
         //.submit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          AddBook ob=new AddBook();
          ob.frame.setVisible(false);
          parentPanel.setVisible(false);
          frame.add(ob.parentPanel);
          ob.submit.setText("DELETE");
    }
}
