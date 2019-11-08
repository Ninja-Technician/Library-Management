import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class SearchCatalog  implements ActionListener
{
    int width=50,loginY=20;
    JFrame frame;
    //Container c;
    JPanel parentPanel;
    JTextField txt1,txt2;
    JButton jb1,jb2,jb4;
    JTable table;
    JScrollPane sp;
    
    
    public SearchCatalog()
    {
        frame=new JFrame("Search Catalog");
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
        designPanel.setBounds(400,10,900,150);
        designPanel.setBackground(Color.GREEN);
        
        // Creating Database Panel
         JPanel dataPanel=new JPanel();
        dataPanel.setLayout(null);
        parentPanel.add(dataPanel);
        dataPanel.setBounds(10,180,1680,580);
        dataPanel.setBackground(Color.GREEN);
        
        txt1=new JTextField("Enter Roll Number");
        txt2=new JTextField("Enter Author's Name or Book Title");
       // txt3=new JTextField("Enter Book Title");
        
        jb1=new JButton("Search Student");
        jb2=new JButton("Search Book");
        //jb3=new JButton("Search Book");
        jb4=new JButton("Available Books");
        
        designPanel.add(txt1);
        designPanel.add(txt2);
       // parentPanel.add(txt3);
        designPanel.add(jb1);
        designPanel.add(jb2);
      //  parentPanel.add(jb3);
        designPanel.add(jb4);
        
        txt1.setBounds(30,30,400,30);
        jb1.setBounds(480,30,150,30);
        
        txt2.setBounds(30,110,400,30);
        jb2.setBounds(480,110,150,30);
        
       // txt3.setBounds(30,190,300,30);
        //jb3.setBounds(380,190,150,30);
        
        jb4.setBounds(680,30,150,110);
        
         String[][] data = { 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100" }, 
            { "TextBook Of Mathematics - III", "7/11/2019", "22/11/2019","Rs. 100"} 
        }; 
  
        // Column Names 
        String[] columnNames = { "Book Title", "Issue Date", "Return Date","Fine" }; 
  
        // Initializing the JTable 
        table = new JTable(data, columnNames); 
        //table.setFont(new Font("Glyphic",Font.PLAIN,20));
        table.setBounds(10,10,1620, 570); 
  
        // adding it to JScrollPane 
        sp = new JScrollPane(table); 
        dataPanel.add(sp);
         sp.setBounds(30, 10, 1620, 570); 
        sp.setVisible(false);
       
        jb1.addActionListener(this);
        jb2.addActionListener(this);
       // jb3.addActionListener(this);
        jb4.addActionListener(this);
        
        
        
    }
    public static void main(String args[])
            {
                SearchCatalog ob=new SearchCatalog();
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        sp.setVisible(true);
        System.out.println("Button pressed");
    }
}
