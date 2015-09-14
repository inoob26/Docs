package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * Created by inoob on 14/09/15.
 */
public class ServiceController {

    private Service service;



    @FXML
    protected void ShowListOfServiceView() {
        try {
            Stage st_list_service = new Stage();
            if(service == null) {
                service = new Service();
                service.show_list(st_list_service);
            } else {
                service.show_list(st_list_service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
