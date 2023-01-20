module com.flacis.cc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.flacis.cc to javafx.fxml;
    exports com.flacis.cc;
}