module com.example.me {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.me to javafx.fxml;
    exports com.example.me;
}