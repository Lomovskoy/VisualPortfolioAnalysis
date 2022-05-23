package com.visual.portfolio.analysis;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VisualPortfolioAnalysisController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}