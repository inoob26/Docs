package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Created by inoob on 07/09/15.
 */
public class DocumentController {

    private Service service;

    @FXML
    protected void ShowChoiceServiceView() {
        try {
            Stage st_choise_service = new Stage();
            if(service == null) {
                service = new Service();
                service.show_choice(st_choise_service);
            } else {
                service.show_choice(st_choise_service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
