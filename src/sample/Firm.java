package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by inoob on 23/08/15.
 */
public class Firm {
    private Stage pStage_add;
    private Stage pStage_edit;
    private Stage pStage_del;

    public void show_add(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFirmView.fxml"));
            pStage_add = primaryStage;
            pStage_add.setTitle("Добавление новой организации");
            pStage_add.setScene(new Scene(root));
            pStage_add.setResizable(false);
            pStage_add.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_edit(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditFirmView.fxml"));
            pStage_edit = primaryStage;
            pStage_edit.setTitle("Изменение реквезитов организации");
            pStage_edit.setScene(new Scene(root));
            pStage_edit.setResizable(false);
            pStage_edit.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_del(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DelFirmView.fxml"));
            pStage_del = primaryStage;
            pStage_del.setTitle("Удаление реквезитов организации");
            pStage_del.setScene(new Scene(root));
            pStage_del.setResizable(false);
            pStage_del.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
