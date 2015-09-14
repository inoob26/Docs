package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by inoob on 30/08/15.
 */
public class Document {



    Stage pStage;

    public void show(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DocumentView.fxml"));
            pStage = primaryStage;
            pStage.setTitle("Формирование документа");
            pStage.setScene(new Scene(root));
            pStage.setResizable(false);
            pStage.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }



}
