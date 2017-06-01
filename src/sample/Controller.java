package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField fname;

    public void createAccount() {
        System.out.println("Hi " + fname.getText());
    }
}
