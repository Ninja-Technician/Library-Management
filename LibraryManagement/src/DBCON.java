import java.sql.*;
public class DBCON 
{
        Connection con;
        DBCON()
        {   
            
            try
            {
                
                Class.forName("com.mysql.cj.jdbc.Driver");//register driver
                        
                String ConnectionURL ="jdbc:mysql://localhost:3306/library_management";//upload driver
                
                con=DriverManager.getConnection(ConnectionURL,"root","husen@123");//establish connection
                
                System.out.println("connection success");
            }
            catch(Exception e)
            {
                System.out.println("connection fail"+e);
            }
        }
        public static void main(String args[])
        {
            DBCON obj=new DBCON();
        }
    
    
}
