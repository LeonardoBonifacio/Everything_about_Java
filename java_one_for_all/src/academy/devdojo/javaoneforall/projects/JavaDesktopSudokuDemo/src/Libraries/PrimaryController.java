package academy.devdojo.javaoneforall.projects.JavaDesktopSudokuDemo.src.Libraries;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        SudokuApplication.setRoot("secondary");
    }
}
