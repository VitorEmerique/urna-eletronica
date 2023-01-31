module com.ufopinha {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.ufopinha to javafx.fxml;

    exports com.ufopinha;
}
