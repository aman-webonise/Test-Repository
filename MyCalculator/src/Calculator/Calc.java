package Calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Calc extends Application {

public static void main(String[] args) { launch(args); }
 Controller C=new Controller();
    @Override public void start(Stage stage) {

        final TextField screen  =C.createScreen();
        final TilePane  buttons = C.createButtons();

        stage.setTitle("Calc");
        stage.initStyle(StageStyle.UTILITY);
        stage.setResizable(false);
        stage.setScene(new Scene(C.createLayout(screen, buttons)));
        stage.show();
    }

    }