
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgotPassword implements ActionListener {
    
    JFrame frame;
    JTextField tx1,pass,re;
    JButton bt1,btn;
    JPanel p,np;
    ForgotPassword()
    {
        frame=new JFrame("Forgot Password");
        
        frame.setBounds(885,400,250,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        Container c=frame.getContentPane();
        c.setBackground(Color.GRAY);
        
        p=new JPanel();
        p.setBounds(0,0,250,400);
        p.setLayout(null);
        c.add(p);
        
        tx1=new JTextField("Enter Mobile No.");
        bt1=new JButton("Search");
        
        p.add(tx1);
        p.add(bt1);
        
        tx1.setBounds(50,50,150,30);
        bt1.setBounds(85,110,80,30);
        
        np=new JPanel();
        np.setBounds(0,0,250,400);
        np.setLayout(null);
        c.add(np);
        
        pass=new JTextField("Enter New Password");
        re=new JTextField("Conform Password");
        btn=new JButton("SUBMIT");
        
        np.add(pass);
        np.add(re);
        np.add(btn);
        
        pass.setBounds(50,50,150,30);
        re.setBounds(50,100,150,30);
        btn.setBounds(85,180,80,30);
        
        np.setVisible(false);
        
        bt1.addActionListener(this);
        btn.addActionListener(this);
        frame.setVisible(true);
        
        
    }
    public static void main(String args[])
    {
        ForgotPassword ob =new ForgotPassword();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
        {
            String nmbr=tx1.getText().trim();
            int count=0;
            String str[]={"8789957324","9122572479"};
            for(String ch : str)
            {
                if(ch.equals(nmbr))
                {
                    p.setVisible(false);
                    np.setVisible(true);
                    count++;
                    break;
                }
            }
            if(count==0)
                JOptionPane.showMessageDialog(null, "No Records Found.");
        }
         if(e.getSource()==btn)
        {
            String str1=pass.getText();
                    String str2=re.getText();
                    if(str1.equals(str2))
                    {
                        //update the password in Database
                        
                        //Sucessfully Changed Password
                          JOptionPane.showMessageDialog(null, "Sucessfully Changed");
                           LoginPage ob=new LoginPage();
                            ob.frame.setVisible(true);
                             frame.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "New Password and Confirm Password Does not match.");
                    }
        }
    }
}
