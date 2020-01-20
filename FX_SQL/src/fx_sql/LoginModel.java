package fx_sql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoginModel {
    Connection connection;
    public LoginModel(){
        try {
            connection = SQLConnection.Connector();
            if(connection == null)
                System.exit(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean isDbConnected(){
        try{
            return !connection.isClosed();
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        
    }
}
