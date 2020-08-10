import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyJavaFX2  extends Application {
    private static double WIDTH = 400;
    private static double HEIGHT = 200;
    private static double CENTER_X = WIDTH / 2;
    private static double CENTER_Y = HEIGHT / 2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polyline xAxis = new Polyline();
        drawXAxis(pane, xAxis);
        Polyline yAxis = new Polyline();
        drawYAxis(pane, yAxis);

        Polyline polyline1 = new Polyline();
        polyline1.setStroke(Color.RED);
        ObservableList<Double> list = polyline1.getPoints();
        
        for (int x = -170; x <= 170; x++) {
            list.add(x + CENTER_X);
            double y = CENTER_Y - 50 * Math.sin((x / 100.0) * 2 * Math.PI);
            list.add(y);
        }
        
        Text text1 = new Text(100, 110, "-2\u03c0");
        Text text2 = new Text(155,110,"-\u03c0");
        Text text3 = new Text(205,110,"0");
        Text text4 = new Text(255,110,"\u03c0");
        Text text5 = new Text(305,110,"2\u03c0");
        pane.getChildren().addAll(text1,text2,text3,text4,text5);
        
        Circle point = new Circle(list.get(0),list.get(1),10);
        point.setFill(new Color(0, 0.5, 0, 1));
        
        PathTransition path = new PathTransition(Duration.millis(4000), polyline1, point);
        path.setCycleCount(PathTransition.INDEFINITE);
        pane.getChildren().addAll(xAxis, yAxis, polyline1, point);
        path.setAutoReverse(true);
        path.play();
        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
            	path.pause();
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
            	path.play();
            }
          });
        
        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.show();
    }

    private static void drawXAxis(Pane pane, Polyline xAxis) { //x√‡
        ObservableList<Double> xAxisList = xAxis.getPoints();
        double limit = WIDTH * 0.95;

        for (double x = 0; x < limit; x++) {
            xAxisList.add(x);
            xAxisList.add(CENTER_Y);
        }

        Line line1 = new Line(limit, CENTER_Y, limit - WIDTH * 0.03, CENTER_Y * 0.9);
        Line line2 = new Line(limit, CENTER_Y, limit - WIDTH * 0.03, CENTER_Y / 0.9);
        Text text = new Text(limit + (WIDTH * 0.003), HEIGHT * 0.4, "X");
        pane.getChildren().addAll(line1, line2, text);
    }

    private static void drawYAxis(Pane pane, Polyline yAxis) { //y√‡
        ObservableList<Double> yAxisList = yAxis.getPoints();
        double limit = HEIGHT*0.95;

        for (double y = 0; y < limit; y++) {
            yAxisList.add(CENTER_X);
            yAxisList.add(y + HEIGHT * 0.1);
        }
        Line line1 = new Line(CENTER_X, HEIGHT * 0.1, CENTER_X - WIDTH * 0.02, HEIGHT * 0.2);
        Line line2 = new Line(CENTER_X, HEIGHT * 0.1, CENTER_X + WIDTH * 0.02, HEIGHT * 0.2);
        Text text = new Text(limit + (WIDTH * 0.05), HEIGHT * 0.1, "Y");
        pane.getChildren().addAll(line1, line2,text);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}