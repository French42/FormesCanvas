module com.example.formescanvas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.formescanvas to javafx.fxml;
    exports com.example.formescanvas;
}