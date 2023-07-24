module com.example.nebula3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.example.nebula3 to javafx.fxml;
    exports com.example.nebula3;
}