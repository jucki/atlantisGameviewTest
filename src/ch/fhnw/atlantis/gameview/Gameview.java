package ch.fhnw.atlantis.gameview;

/**
 * Created by Jonas on 02.11.2016.
 */

        import    javafx.application.Application;
        import    javafx.scene.Scene;
        import    javafx.scene.control.Label;
        import    javafx.scene.layout.BorderPane;
        import    javafx.stage.Stage;

public class Gameview extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX");

        BorderPane root = new BorderPane();
        root.setCenter(label);
        Scene scene = new Scene(root, 1280, 800);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Hello, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
