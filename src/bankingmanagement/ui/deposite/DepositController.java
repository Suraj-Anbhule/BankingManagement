/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingmanagement.ui.deposite;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Shree
 */
public class DepositController implements Initializable {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private JFXTextField depositeamount;
    @FXML
    private JFXTextField confdepositeamount;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton deposite;
    @FXML
    private JFXButton cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onDeosite(ActionEvent event) {
    }

    @FXML
    private void OnCancel(ActionEvent event) {
    }
    
}
