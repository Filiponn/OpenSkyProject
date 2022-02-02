module edu.ib.openskyproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ib.openskyproject to javafx.fxml;
    exports edu.ib.openskyproject;
}