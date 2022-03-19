module me.winterreisender.ezzenmode {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;
    //requires javafx.web;
    opens me.winterreisender.ezzenmode to javafx.fxml;
    exports me.winterreisender.ezzenmode;
}