module com.mycompany.cfx_003 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cfx_003 to javafx.fxml;
    exports com.mycompany.cfx_003;
}
