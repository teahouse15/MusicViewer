package top.myjinji.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MusicViewer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 从fxml文件中读取Parent(布局)
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));

        // 场景
        Scene scene = new Scene(root, 550, 780);
        scene.getStylesheets().add(getClass().getResource("/fxml/css/main.css").toExternalForm());

        primaryStage.setTitle("文件属性");
        primaryStage.setScene(scene);

        primaryStage.show();
    }









    public static void main(String[] args) {
        launch();
    }
}
