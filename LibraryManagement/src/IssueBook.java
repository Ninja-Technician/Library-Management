
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class IssueBook extends JFrame implements ActionListener
{
    JLabel isbn,roll,issueDt,returnDt;
    JTextField isbnTxt,rollTxt,issMnth,issYr,returnDtTxt;
    JButton submit;
    JComboBox dt,mn,yr;
    JFrame frame;
    JPanel parentPanel ;
    
    
    IssueBook()
    {
        int pointX=550,pointY=100;
        
        frame=new JFrame();
        //frame.setVisible(true);
        frame.setBounds(0,0,1500,900);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBackground(Color.GREEN);
        
        parentPanel=new JPanel();
        parentPanel.setLayout(null);
        frame.add(parentPanel);
        parentPanel.setBounds(pointX,pointY,450,600);
       // design.setBackground(Color.BLUE);
        
        JPanel p = new JPanel();
        parentPanel.add(p);
        p.setLayout(null);
        p.setBounds(0,0,450,600);
        p.setBackground(Color.GREEN);
        
        Font text=new Font("Glyphic",Font.PLAIN,20);
         Font myDate=new Font("Glyphic",Font.PLAIN,16);
        Color col = new Color(255,212,169);
        Color colLogin = new Color(11,13,4);
        Color colSignup = new Color(51,51,255);
        
        // Adding components into the Pannel
               /*
        label1=new JLabel("LIBRARIAN LOG IN");
        label1.setBounds(60,20,400,50);
        label1.setFont(new Font("Glyphic",Font.BOLD,30));
        p.add(label1);
                       */
        
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
        
        issueDt=new JLabel("ISSUE");
        issueDt.setBounds(30,170,120,30);
        issueDt.setFont(text);
        p.add(issueDt);
        
        /*
        issDt=new JTextField();
        issDt.setBounds(170,170,50,30);
        issDt.setFont(text);
        issDt.setBackground(col);
        p.add(issDt);
        
        issMnth=new JTextField();
        issMnth.setBounds(245,170,50,30);
        issMnth.setFont(text);
        issMnth.setBackground(col);
        p.add(issMnth);
        
        issYr=new JTextField();
        issYr.setBounds(315,170,50,30);
        issYr.setFont(text);
        issYr.setBackground(col);
        p.add(issYr);
        */
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
        
       
        
        returnDt=new JLabel("RETURN");
        returnDt.setBounds(30,240,120,30);
        returnDt.setFont(text);
        p.add(returnDt);
        
        returnDtTxt=new JTextField();
        returnDtTxt.setBounds(170,240,200,30);
        returnDtTxt.setEditable(false);
        returnDtTxt.setFont(text);
        returnDtTxt.setBackground(col);
        p.add(returnDtTxt);
        
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
       
            
    }
    
    public String newDate(String issueDate)
    {
        String str="";
        
        return str;
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
            intDate=Integer.parseInt(issueDate[0]);
            intMnth=mn.getSelectedIndex()+1;
            rtnMnth=intMnth;
            intYr=Integer.parseInt(issueDate[2]);
            String returnDt="";
            
            if(issueDate[1].equals("FEB"))
            {
                 rtnDate=(((intDate+15)%28)==0)?28:(intDate+15)%28;
                 if((intDate+15)>28)
                     rtnMnth=intMnth+1;
            }
            else if((issueDate[1].equals("APR"))||(issueDate[1].equals("JUN"))||(issueDate[1].equals("SEP"))||(issueDate[1].equals("NOV")))
                    {
                         rtnDate=(((intDate+15)%30)==0)?30:(intDate+15)%30;
                         if((intDate+15)>30)
                         rtnMnth=intMnth+1;
                    }
            else
            {
              rtnDate=(((intDate+15)%31)==0)?31:(intDate+15)%31;
                 if((intDate+15)>31)
                     rtnMnth=intMnth+1;
            }
            if(rtnMnth>12)
            {
                rtnMnth=rtnMnth%12;
                rtnYr=intYr+1;
            }
            else
            {
                rtnYr=intYr;
            }
            
            returnDtTxt.setText(rtnDate+"/"+rtnMnth+"/"+rtnYr);
        }
        /*
         if(e.getSource()==btn1)
        {
            label1.setText("STUDENT LOG IN");
        }
          if(e.getSource()==btn2)
        {
            label1.setText("LIBRARIAN LOG IN");
        }
              */
    }
    public static void main(String args[])
    {
        IssueBook ob =new IssueBook();
       
        
    }
}
