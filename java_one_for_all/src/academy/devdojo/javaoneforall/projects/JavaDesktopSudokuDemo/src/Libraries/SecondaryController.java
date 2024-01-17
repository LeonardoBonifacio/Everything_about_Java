package academy.devdojo.javaoneforall.projects.JavaDesktopSudokuDemo.src.Libraries;

import java.io.IOException;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        SudokuApplication.setRoot("primary");
    }
}