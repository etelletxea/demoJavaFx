module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demojavafx to javafx.fxml;
    exports com.example.demojavafx;
}