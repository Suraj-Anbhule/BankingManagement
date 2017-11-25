/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingmanagement.ui.accountinfo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
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
public class Account_infoController implements Initializable {

    @FXML
    private JFXTextField accountno;
    @FXML
    private JFXTextField balance;
    @FXML
    private JFXTextField password;
    @FXML
    private JFXTextField passwordconf;
    @FXML
    private JFXRadioButton savingtype;
    @FXML
    private JFXRadioButton currenttype;
    @FXML
    private JFXRadioButton activestate;
    @FXML
    private JFXRadioButton blockedstate;
    @FXML
    private JFXButton finish;
    @FXML
    private JFXButton cancel;
    @FXML
    private AnchorPane rootpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onFinish(ActionEvent event) {
    }

    @FXML
    private void onCancel(ActionEvent event) {
    }
    
}
