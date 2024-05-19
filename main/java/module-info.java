module com.example.lab18 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab18 to javafx.fxml;
    exports com.example.lab18;
}