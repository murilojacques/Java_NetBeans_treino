module application.cfx_012 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_012 to javafx.fxml;
    exports application.cfx_012;
}
