module com.example.se302syllabusproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.se302syllabusproject to javafx.fxml;
    exports com.example.se302syllabusproject;
}