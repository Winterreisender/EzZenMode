module com.example.jfxplay {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    //requires javafx.web;
    opens com.example.jfxplay to javafx.fxml;
    exports com.example.jfxplay;
}