module application.cfx_006 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_006 to javafx.fxml;
    exports application.cfx_006;
}
