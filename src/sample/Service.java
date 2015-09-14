package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by inoob on 23/08/15.
 */
public class Service {
    private Stage pStage_add;
    private Stage pStage_edit;
    private Stage pStage_del;
    private Stage pStage_choise;
    private Stage pStage_list;

    public void show_add(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddServiceView.fxml"));
            pStage_add = primaryStage;
            pStage_add.setTitle("Добавление новой услуги");
            pStage_add.setScene(new Scene(root));
            pStage_add.setResizable(false);
            pStage_add.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_edit(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditServiceView.fxml"));
            pStage_edit = primaryStage;
            pStage_edit.setTitle("Изменение данных об услуге");
            pStage_edit.setScene(new Scene(root));
            pStage_edit.setResizable(false);
            pStage_edit.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_del(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DelServiceView.fxml"));
            pStage_del = primaryStage;
            pStage_del.setTitle("Удаление услуги из базы");
            pStage_del.setScene(new Scene(root));
            pStage_del.setResizable(false);
            pStage_del.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_choice(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ChoiseServiceView.fxml"));
            pStage_choise = primaryStage;
            pStage_choise.setTitle("Выбор оказаных услуг");
            pStage_choise.setScene(new Scene(root));
            pStage_choise.setResizable(false);
            pStage_choise.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void show_list(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ListOfServiceView.fxml"));
            pStage_list = primaryStage;
            pStage_list.setTitle("Выбор оказаных услуг");
            pStage_list.setScene(new Scene(root));
            pStage_list.setResizable(false);
            pStage_list.show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
