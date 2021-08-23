module edu.espol.guessplace {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.espol.guessplace to javafx.fxml;
    exports edu.espol.guessplace;
}
