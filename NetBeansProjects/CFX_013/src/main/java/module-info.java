module application.cfx_013 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_013 to javafx.fxml;
    exports application.cfx_013;
}
