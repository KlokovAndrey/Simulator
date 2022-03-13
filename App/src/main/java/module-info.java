module com.simulator.app.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.simulator.app.app to javafx.fxml;
    exports com.simulator.app.app;
}