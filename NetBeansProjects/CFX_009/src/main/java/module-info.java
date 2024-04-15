module application.cfx_009 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_009 to javafx.fxml;
    exports application.cfx_009;
}
