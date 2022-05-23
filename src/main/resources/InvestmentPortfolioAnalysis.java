package ru.investment.portfolio.analysis.investmentportfolioanalysis;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Calendar;


public class InvestmentPortfolioAnalysis {// extends Application {

    public static void main(String[] args) throws Exception {
//        launch();
//        Calendar from = Calendar.getInstance();
//        from.clear();
//        Calendar to = Calendar.getInstance();
//        to.clear();
//
//        from.set(2016, 2, 15);
//        to.set(2016, 2, 28);

//        ObjectMapper mapper = new ObjectMapper();
//        Person person = mapper.readValue(jsonString, Person.class);

        urlToFile(new URL("https://query1.finance.yahoo.com/v10/finance/quoteSummary/SPY?modules=price"),
                new File("file.json")
        );

//        urlToFile(
//                new URL(String.format(
//                        "https://ichart.finance.yahoo.com/table.csv?s=AAPL&a=%s&b=%s&c=%s&d=%s&e=%s&f=%s&g=d&ignore=.csv",
//                        from.get(Calendar.MONTH),
//                        from.get(Calendar.DAY_OF_MONTH),
//                        from.get(Calendar.YEAR),
//                        to.get(Calendar.MONTH),
//                        to.get(Calendar.DAY_OF_MONTH),
//                        to.get(Calendar.YEAR)
//                )),
//                new File("file.csv")
//        );
    }

//    @Override
//    public void start(Stage stage) {
//
//        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
//
//        Label label = new Label();
//        label.setText("Введите бумаги");
//
//        TextArea textArea = new TextArea();
//        textArea.setPrefColumnCount(15);
//        textArea.setPrefRowCount(20);
//
//        Button button = new Button("Расчитать");
//
//        button.setOnAction(event -> {
//            String[] arr = textArea.getText().split("\n");
//
////            var yahooFinance = new YahooFinance();
////            Stock stock = YahooFinance.get("INTC");
////            BigDecimal price = stock.getQuote().getPrice();
//
//            for (String s : arr) {
//                String[] arr2 = s.split("\t");
//                String key = arr2[0];
//                double val = Double.parseDouble(arr2[1]);
//                data.add(new PieChart.Data(key, val));
//
//            }
//        });
//
//        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, label, textArea, button);
//
////        root.setAlignment(Pos.CENTER);
//        PieChart chart = new PieChart(data);
//        chart.setTitle("My portfolio");
//        root.getChildren().addAll(chart);
//        Scene scene = new Scene(root, 700, 500);
//
//        stage.setScene(scene);
//        stage.setTitle("Portfolio");
//        stage.show();
//
//    }

    public static void urlToFile(URL url, File file) throws Exception {
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}