module application.cfx_010 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_010 to javafx.fxml;
    exports application.cfx_010;
}
