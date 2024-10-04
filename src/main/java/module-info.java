module org.champlain.prog2.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.champlain.prog2.demo to javafx.fxml;
    exports org.champlain.prog2.demo;
}