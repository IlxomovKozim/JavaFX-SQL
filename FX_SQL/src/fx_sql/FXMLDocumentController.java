package fx_sql;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

 /*
 * @author KOZIM
 */
public class FXMLDocumentController implements Initializable {
    public LoginModel loginModel = new LoginModel();
    
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(loginModel.isDbConnected()){
            label.setText("Connected");
        }else{
            label.setText("Not Connected");
        }
    }    
    
}
