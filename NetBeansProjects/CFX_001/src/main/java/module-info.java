module com.mycompany.cfx_001 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cfx_001 to javafx.fxml;
    exports com.mycompany.cfx_001;
}
