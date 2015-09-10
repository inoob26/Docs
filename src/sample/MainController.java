package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainController {

    private Document dc;
    private AddFirm af;

    @FXML
    protected void ShowDocumentView() {
        try {
            Stage st_document = new Stage();
            dc = new Document();
            dc.show(st_document);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowAddFirmView() {
        try {
            Stage st_add_firm = new Stage();
            af = new AddFirm();
            af.show(st_add_firm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
