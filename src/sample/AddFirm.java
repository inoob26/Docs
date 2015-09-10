package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by inoob on 11/09/15.
 */
public class AddFirm{

    Stage pStage;

    public void show(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFirm.fxml"));
            pStage = primaryStage;
            pStage.setTitle("Добавление новой организации");
            pStage.setScene(new Scene(root));
            pStage.setResizable(false);
            pStage.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
