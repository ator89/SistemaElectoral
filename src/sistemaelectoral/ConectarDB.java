

package sistemaelectoral;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConectarDB {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/se_hn", "root", "root");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return con;
    }

}
