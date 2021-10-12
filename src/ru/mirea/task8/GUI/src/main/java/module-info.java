module com.example.gui11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui11 to javafx.fxml;
    exports com.example.gui11;
}