package kroryi.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//원격지 수정
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
