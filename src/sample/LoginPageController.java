package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private TextField usernameTextField, passwordTextField;
    @FXML
    private Button btnLogin, btnExit;

    @FXML
    private void handleButtonAction(ActionEvent event){
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        if(username.equals("javafx") && password.equals("letmepass")){
            label.setText("you shall pass!");
        }else
        {
            label.setText(" no no");
        }
        System.out.println("you clicked me!");
//        label.setText("pass");
    }
    @FXML
    private void handleBtnExitAction(ActionEvent event){
        Platform.exit();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
