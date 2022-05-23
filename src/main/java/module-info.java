module com.visual.portfolio.analysis.visualportfolioanalysis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.visual.portfolio.analysis to javafx.fxml;
    exports com.visual.portfolio.analysis;
}