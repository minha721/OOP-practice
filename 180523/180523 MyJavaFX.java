import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;

public class MyJavaFX extends Application {

    private static double[] percent = new double[]{0.20, 0.26, 0.28, 0.26};
    private static String[] titles = new String[] {
            "Apple -- " + String.format("%d%s", (int)(100 * percent[0]), "%"),
            "HTC -- " + String.format("%d%s", (int)(100 * percent[1]), "%"),
            "Samsung -- " + String.format("%d%s", (int)(100 * percent[2]), "%"),
            "Others -- "+ String.format("%d%s", (int)(100 * percent[3]), "%")
    };
    private static Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

    private static double RADIUS = 100;
    private static double CENTER_X = 200;
    private static double CENTER_Y = 200;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle c = new Circle(CENTER_X, CENTER_Y, RADIUS, Color.TRANSPARENT);
        shapes.add(c);
        
        double angle = 0;
        for (int i = 0; i < titles.length; i++) {
            double length = percent[i] * 360;
            Arc arc = new Arc(CENTER_X, CENTER_Y, RADIUS, RADIUS, angle, length);
            arc.setFill(colors[i]);
            arc.setType(ArcType.ROUND);
            shapes.add(arc);

            //text의 대략적인 위치
            double x = CENTER_X + RADIUS * Math.cos(Math.toRadians(angle * -1 - (length / 2)));
            double y = CENTER_Y + RADIUS * Math.sin(Math.toRadians(angle * -1 - (length / 2)));

            //text 위치 자세히 조정
            if (x > CENTER_X) {
            	if(y>CENTER_Y) {
            		x-=60;
            		y+=25;
            	}
            	else {
            		x-=65;
            		y+=40;
            	}
            }
            
            if (x < CENTER_X) {
            	if(y>CENTER_Y) {
            		x-=25;
            		y-=45;
            	}
            	else {
            		x+=30;
            		y-=15;
            	}
            }
            
            Text text = new Text(x, y, titles[i]);
            shapes.add(text);

            angle += length;
        }

        pane.getChildren().addAll(shapes);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}