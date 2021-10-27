module lab_.lab_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens lab_7.lab_7 to javafx.fxml;
    exports lab_7.lab_7;
}