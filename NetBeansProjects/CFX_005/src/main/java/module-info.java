module application.cfx_005 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_005 to javafx.fxml;
    exports application.cfx_005;
}
