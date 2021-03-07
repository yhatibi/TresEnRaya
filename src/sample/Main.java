package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("tres_en_raya.fxml"));


        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setResizable(false);


        primaryStage.setScene(scene);
        scene.getStylesheets().add("styles.css");

        primaryStage.setTitle("Tres en Raya");
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}