module application.cfx_011 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_011 to javafx.fxml;
    exports application.cfx_011;
}
