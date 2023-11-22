module com.example.intelijdemo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intelijdemo01 to javafx.fxml;
    exports com.example.intelijdemo01;
}