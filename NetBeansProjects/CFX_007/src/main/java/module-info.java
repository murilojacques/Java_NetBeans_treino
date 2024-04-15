module application.cfx_007 {
    requires javafx.controls;
    requires javafx.fxml;

    opens application.cfx_007 to javafx.fxml;
    exports application.cfx_007;
}
