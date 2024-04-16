module application.cfx_015 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_015 to javafx.fxml;
    exports application.cfx_015;
}
