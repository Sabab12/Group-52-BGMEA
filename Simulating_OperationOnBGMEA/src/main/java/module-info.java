module com.bgmea.simulating_operationonbgmea {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens com.bgmea.simulating_operationonbgmea to javafx.fxml;
    exports com.bgmea.simulating_operationonbgmea;
}