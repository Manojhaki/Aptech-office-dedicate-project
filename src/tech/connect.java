
 package tech;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connect
{
    Connection c;
    connect ()
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/manoj","Manoj","");
                }
                catch(Exception e)

                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

}
