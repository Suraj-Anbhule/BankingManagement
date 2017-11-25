/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingmanagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Shree
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private JFXTextField custname;
    @FXML
    private JFXTextField custaddress;
    @FXML
    private JFXTextField custmobile;
    @FXML
    private JFXTextField custaddhar;
    @FXML
    private JFXRadioButton male;
    @FXML
    private ToggleGroup gender;
    @FXML
    private JFXRadioButton female;
    @FXML
    private DatePicker datepicker;
    @FXML
    private JFXButton create;
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
    private void onCreate(ActionEvent event) {
    }

    @FXML
    private void onCancel(ActionEvent event) {
    }
    
}
