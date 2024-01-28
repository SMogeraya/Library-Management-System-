import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class connection {
  public static Connection ConnecrDb(){
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
         System.out.println("Connected");
         return conn;
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          return null;
      }
  }  
}
