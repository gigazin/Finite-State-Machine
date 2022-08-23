module com.example.finitestatemachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finitestatemachine to javafx.fxml;
    exports com.example.finitestatemachine;
}