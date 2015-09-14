package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;


public class MainController {

    private Document dc;
    private Firm firm;
    private Service service;


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
            if(firm == null) {
                firm = new Firm();
                firm.show_add(st_add_firm);
            } else {
                firm.show_add(st_add_firm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowEditFirmView() {
        try {
            Stage st_edit_firm = new Stage();
            if(firm == null) {
                firm = new Firm();
                firm.show_edit(st_edit_firm);
            } else {
                firm.show_edit(st_edit_firm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowDelFirmView() {
        try {
            Stage st_del_firm = new Stage();
            if(firm == null) {
                firm = new Firm();
                firm.show_del(st_del_firm);
            } else {
                firm.show_del(st_del_firm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowAddServiceView() {
        try {
            Stage st_add_service = new Stage();
            if(service == null) {
                service = new Service();
                service.show_add(st_add_service);
            } else {
                service.show_add(st_add_service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowEditServiceView() {
        try {
            Stage st_edit_service = new Stage();
            if(service == null) {
                service = new Service();
                service.show_edit(st_edit_service);
            } else {
                service.show_edit(st_edit_service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void ShowDelServiceView() {
        try {
            Stage st_del_service = new Stage();
            if(service == null) {
                service = new Service();
                service.show_del(st_del_service);
            } else {
                service.show_del(st_del_service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
