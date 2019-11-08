    
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class ViewAccount  implements ActionListener
{
    int width=50,loginY=20;
    JFrame frame;
    //Container c;
    JPanel parentPanel;   
    JTable table;
    JScrollPane sp;
    
    
    public ViewAccount()
    {
        frame=new JFrame("View Account");
        //frame.setVisible(true);
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        //Container c= frame.getContentPane();
        
        parentPanel=new JPanel();
        parentPanel.setLayout(null);
        frame.add(parentPanel);
        parentPanel.setBounds(width,loginY,1700,800);
        parentPanel.setBackground(Color.GREEN);
        
        // Creating Design Panel
        JPanel designPanel=new JPanel();
        designPanel.setLayout(null);
        parentPanel.add(designPanel);
        designPanel.setBounds(400,10,900,10);
        designPanel.setBackground(Color.GREEN);
        
        // Creating Database Panel
         JPanel dataPanel=new JPanel();
        dataPanel.setLayout(null);
        parentPanel.add(dataPanel);
        dataPanel.setBounds(10,40,1680,700);
        dataPanel.setBackground(Color.GREEN);
        
       
      
        
         String[][] data = { 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100" }, 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100"} 
        }; 
  
        // Column Names 
        String[] columnNames = { "Book Title", "Issue Date", "Return Date","Fine" }; 
  
        // Initializing the JTable 
        table = new JTable(data, columnNames); 
        //table.setFont(new Font("Glyphic",Font.PLAIN,20));
        table.setBounds(10,10,1650, 690); 
  
        // adding it to JScrollPane 
        sp = new JScrollPane(table); 
        dataPanel.add(sp);
         sp.setBounds(20, 10, 1650, 690); 
        sp.setVisible(false);
       
       
        
        
        
    }
    public static void main(String args[])
            {
                ViewAccount ob=new ViewAccount();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        sp.setVisible(true);
        
    }
}