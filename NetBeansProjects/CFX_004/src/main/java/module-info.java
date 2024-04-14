module application.cfx_004 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_004 to javafx.fxml;
    exports application.cfx_004;
}
