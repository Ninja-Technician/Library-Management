
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
     String returnDat="15/12/2019";
    
    
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
        
        returnDt=new JLabel("RETURN");
        returnDt.setBounds(30,170,120,30);
        returnDt.setFont(text);
        p.add(returnDt);
        
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
            
            int day=0,temp=0;
            double fineAmount=0.0;
           
            if(intMnth>rtnMnth)
            {
                rtnMnth=12+rtnMnth;
                System.out.println("nxt yr case entered");
            }
             if(intMnth==rtnMnth)
            {
                day=intDate-rtnDate;
                System.out.println("equl to entered");
            }
            else
            {
                if(temp==1)
                    System.out.println("after increasing rtn mnth entered");
                else
                System.out.println("normal case entered");
            for(int i=intMnth;i<=rtnMnth;i++)
            {
                if(i==intMnth)
                {
                     if(i==2)
                     {
                         day=28-intDate;
                       }
                       else if((i==4)||(i==6)||(i==9)||(i==11))
                            day=30-intDate;
                        else
                             day=31-intDate;
                }
                else if(i==rtnMnth)
                    day=day+rtnDate;
                else
                {
                     if((i%12)==2)
                     {
                         day=day+28;
                       }
                       else if(((i%12)==4)||((i%12)==6)||((i%12)==9)||((i%12)==11))
                            day=day+30;
                        else
                             day=day+31;
                }
            }
            }
            /*
            if(rtnMnth>12)
            {
                rtnMnth=rtnMnth%12;
                rtnYr=intYr+1;
            }
            else
            {
                rtnYr=intYr;
            }
            */
            fineAmount=day*5;
            fine.setText("Rs. "+fineAmount+" & "+day+" days");
           // fine.setText(intDate+"/"+intMnth+"/"+intYr);
            //fine.setText(rtnDate+"/"+rtnMnth+"/"+rtnYr);
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
}
