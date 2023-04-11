module com.example.operadoresarit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operadoresarit to javafx.fxml;
    exports com.example.operadoresarit;
}