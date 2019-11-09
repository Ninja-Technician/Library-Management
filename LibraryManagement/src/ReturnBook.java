
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ReturnBook extends JFrame implements ActionListener
{
    JLabel isbn,roll,returnDt,expDt,fine;
    JTextField isbnTxt,rollTxt,issMnth,issYr,rtnExp;
    JButton submit;
    JComboBox dt,mn,yr;
    JFrame frame;
    JPanel parentPanel;
     String returnDat="15/5/2020";
     
    
    ReturnBook()
    {
        
        int pointX=550,pointY=100;
        frame=new JFrame();
        //frame.setVisible(true);
        frame.setBounds(0,0,1920,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        
        parentPanel=new JPanel();
        parentPanel.setLayout(null);
        frame.add(parentPanel);
        parentPanel.setBounds(pointX,pointY,450,600);
        
        JPanel p = new JPanel();
        parentPanel.add(p);
        p.setLayout(null);
        p.setBounds(0,0,450,600);
        p.setBackground(Color.GREEN);
        
        Font text=new Font("Glyphic",Font.PLAIN,20);
        Font myDate=new Font("Glyphic",Font.PLAIN,16);
        Font largeText=new Font("Glyphic",Font.BOLD,35);
        Color col = new Color(255,212,169);
        Color colLogin = new Color(11,13,4);
        Color colSignup = new Color(51,51,255);
        
        isbn=new JLabel("ISBN");
        isbn.setBounds(30,30,120,30);
        isbn.setFont(text);
        p.add(isbn);
        
        isbnTxt=new JTextField();
        isbnTxt.setBounds(170,30,200,30);
        isbnTxt.setFont(text);
        isbnTxt.setBackground(col);
        p.add(isbnTxt);
        
        roll=new JLabel("ROLL NO.");
        roll.setBounds(30,100,120,30);
        roll.setFont(text);
        p.add(roll);
        
        rollTxt=new JTextField();
        rollTxt.setBounds(170,100,200,30);
        rollTxt.setFont(text);
        rollTxt.setBackground(col);
        p.add(rollTxt);
        
        returnDt=new JLabel("RETURN");
        returnDt.setBounds(30,170,120,30);
        returnDt.setFont(text);
        p.add(returnDt);
        
        String strDt[]=new String[31];
        for(int i=0;i<31;i++)
            strDt[i]=i+1+"";
        
        String strMn[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        String strYr[]=new String[20];
        for(int i=0;i<20;i++)
            strYr[i]=i+2019+"";
        
        dt=new JComboBox(strDt);
         dt.setBounds(170,170,60,30);
        dt.setFont(myDate);
        dt.setBackground(col);
        //dt.setEditable(true);
        p.add(dt);
        
         mn=new JComboBox(strMn);
         mn.setBounds(250,170,80,30);
        mn.setFont(myDate);
        mn.setBackground(col);
       // mn.setEditable(true);
        p.add(mn);
        
        yr=new JComboBox(strYr);
         yr.setBounds(350,170,80,30);
        yr.setFont(myDate);
        yr.setBackground(col);
        //yr.setEditable(true);
        p.add(yr);
        
       
        
        expDt=new JLabel("EXPECTED");
        expDt.setBounds(30,240,120,30);
        expDt.setFont(text);
        p.add(expDt);
         
        rtnExp=new JTextField();
        rtnExp.setBounds(170,240,200,30);
        rtnExp.setEditable(false);
        rtnExp.setFont(text);
        rtnExp.setBackground(col);
        p.add(rtnExp);
        
        rtnExp.setText(returnDat);
        
        fine=new JLabel("FINE Rs. 100");
        fine.setBounds(50,300,350,60);
        fine.setFont(largeText);
        p.add(fine);
        
         submit=new JButton("SUBMIT");
        submit.setBounds(150,390,150,30);
        submit.setFont(text);
       // submit.setBackground(col);
        p.add(submit);
        
        submit.addActionListener(this);
        dt.addActionListener(this);
        mn.addActionListener(this);
        yr.addActionListener(this);
        
          p.validate();
          frame.setResizable(false);
       
            
    }
    
    public String newDate(String issueDate)
    {
        String str="";
        
        return str;
    }

     public static void main(String args[])
    {
        ReturnBook ob =new ReturnBook();
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
        if((e.getSource()==dt)||(e.getSource()==mn)||(e.getSource()==yr))
        {
            String issueDate[]=new String[3];
            String returnDate[]=new String[3];
            issueDate[0]=(String)dt.getSelectedItem();
            issueDate[1]=(String)mn.getSelectedItem();
            issueDate[2]=(String)yr.getSelectedItem();
            
           
            
            int intDate=0,intMnth=0,intYr=0;
            int rtnDate=0,rtnMnth=0,rtnYr=0;
            rtnDate=Integer.parseInt(issueDate[0]);
            rtnMnth=mn.getSelectedIndex()+1;
            //rtnMnth=intMnth;
            rtnYr=Integer.parseInt(issueDate[2]);
            
            
            intDate=Integer.parseInt(returnDat.substring(0,(returnDat.indexOf('/'))));
            intMnth=Integer.parseInt(returnDat.substring(returnDat.indexOf('/')+1,(returnDat.lastIndexOf('/'))));
            intYr=Integer.parseInt(returnDat.substring(returnDat.lastIndexOf('/')+1,returnDat.length()));
            
              System.out.println("Expected date = "+intDate+" / "+intMnth+" / "+intYr);
              System.out.println("Returned date = "+rtnDate+" / "+rtnMnth+" / "+rtnYr);
              
              ReturnBookFunction ob=new ReturnBookFunction();
              double fineAmount;
              int day=0;
             
              day=ob.dayCalculation(intDate, intMnth, intYr, rtnDate, rtnMnth, rtnYr);
              
              fineAmount=day*5;
            fine.setText("Rs. "+fineAmount+" & "+day+" days");
           // fine.setText(intDate+"/"+intMnth+"/"+intYr);
            //fine.setText(rtnDate+"/"+rtnMnth+"/"+rtnYr);
        }
      
    }
}
