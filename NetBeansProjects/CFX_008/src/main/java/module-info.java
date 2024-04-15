module application.cfx_008 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_008 to javafx.fxml;
    exports application.cfx_008;
}
