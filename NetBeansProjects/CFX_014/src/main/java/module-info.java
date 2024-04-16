module application.cfx_014 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_014 to javafx.fxml;
    exports application.cfx_014;
}
