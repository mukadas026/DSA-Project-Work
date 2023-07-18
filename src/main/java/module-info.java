module com.example.mukadas_maltiti {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.mukadas_maltiti to javafx.fxml;
    exports com.example.mukadas_maltiti;
    exports com.example.mukadas_maltiti.Controllers;
    exports com.example.mukadas_maltiti.Controllers.Admin;
    exports com.example.mukadas_maltiti.Controllers.Client;
    exports com.example.mukadas_maltiti.Models;
    exports com.example.mukadas_maltiti.Views;
    opens com.example.mukadas_maltiti.Controllers to javafx.fxml;
}