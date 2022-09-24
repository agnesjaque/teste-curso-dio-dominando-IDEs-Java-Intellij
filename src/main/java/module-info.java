module com.example.segundoprogramaintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.segundoprogramaintellij to javafx.fxml;
    exports com.example.segundoprogramaintellij;
    exports br.com.dio;
    opens br.com.dio to javafx.fxml;
}