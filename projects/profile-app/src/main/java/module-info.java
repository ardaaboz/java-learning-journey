module com.example.profileapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.profileapp to javafx.fxml;
    exports com.example.profileapp;
}