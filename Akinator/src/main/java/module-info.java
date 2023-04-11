module com.example.akinator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.akinator to javafx.fxml;
    exports com.example.akinator;
}