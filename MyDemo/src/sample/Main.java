package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private TextField usernameTextField ;

    @FXML
    private TextField passwordTextField ;

    @FXML
    private Label messageLabel ;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../resources/FXML/sample.fxml"));
        primaryStage.setTitle("MyDemo");
        primaryStage.setScene(new Scene(root, 300, 275));
        root.setId("pane");

        root.getStylesheets().add("style/path/demo.css");
        primaryStage.show();
    }

    public void validate(ActionEvent actionEvent) {
        messageLabel.setText("");
        if(usernameTextField.getText().isEmpty() && passwordTextField.getText().isEmpty()) {
            messageLabel.setText("Please enter username and password");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
