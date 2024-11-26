module org.example.inventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.inventorymanagementsystem to javafx.fxml;
    exports org.example.inventorymanagementsystem;
}