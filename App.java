package flappy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        stage.setScene(new Scene(
                (new PaneOrganizer()).getRoot(), Constants.BOARD_WIDTH + Constants.CONTROLS_PANE_WIDTH,
                Constants.BOARD_HEIGHT
        ));
        stage.setResizable(false);
        stage.setTitle("Flappy Bird");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // launch is a method inherited from Application
    }
}
