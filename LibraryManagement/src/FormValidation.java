import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class FormValidation{
    public static void main(String args[])
    {
        
    }
    public int validate(String s1,String s2, String s3,String s4,String s5,String s6)
    {
            int flag=0;
            RegistrationPage ob=new RegistrationPage();
            ob.frame.setVisible(false);
            String str=s1.trim()+s2.trim();
            for(int i=0;i<str.length();i++)
            {
                if(Character.isLetter(str.charAt(i)))
                    continue;
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                 JOptionPane.showMessageDialog(ob.frame,"Name must contain only alphabets");
                 System.out.println("wrong");
            }
            
            str=s5;
            if(str.length()<11)
            {
                 for(int i=0;i<str.length();i++)
            {
                if(Character.isDigit(str.charAt(i)))
                    continue;
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                 JOptionPane.showMessageDialog(ob.frame,"Enter correct mobile number");
            }
      
            str=s6;
            if(str.length()<8)
            {
                  flag=1;
                 JOptionPane.showMessageDialog(ob.frame,"Password cannot be less than 8 characters ");
            }
        

        return flag;
    }
}
