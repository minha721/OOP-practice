import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.ScrollBar;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Project extends Application {
	protected Text text = new Text("Show Colors");
	protected ScrollBar slRed = new ScrollBar();
	protected ScrollBar slGreen = new ScrollBar();
	protected ScrollBar slBlue = new ScrollBar();
	protected ScrollBar slOpacity = new ScrollBar();
	protected ScrollBar[] scrollBars = new ScrollBar[4];
	
	@Override // Application�� �ִ� class�� override
	public void start(Stage primaryStage) {

		StackPane paneForText = new StackPane(text);
		paneForText.setPadding(new Insets(50,20,50,20));

		slRed.setMin(0.0);
		slRed.setMax(1.0);
		slGreen.setMin(0.0);
		slGreen.setMax(1.0);
		slBlue.setMin(0.0);
		slBlue.setMax(1.0);
		slOpacity.setMin(0.0);
		slOpacity.setMax(1.0);

		slRed.valueProperty().addListener(e -> setColor());
		slGreen.valueProperty().addListener(e -> setColor());
		slBlue.valueProperty().addListener(e -> setColor());
		slOpacity.valueProperty().addListener(e -> setColor());
		slOpacity.setValue(1);


		// �����̴� grid pane �����
		GridPane paneForScrollBar = new GridPane();
		paneForScrollBar.setAlignment(Pos.CENTER);
		paneForScrollBar.setVgap(10); //��ũ�ѹ� ���� ����
		paneForScrollBar.setHgap(10); //��ũ�ѹ� ���� ����
		paneForScrollBar.add(new Label("Red"), 0, 0);
		paneForScrollBar.add(slRed, 1, 0); //Red ��ũ�ѹ� add
		paneForScrollBar.add(new Label("Green"), 0, 1);
		paneForScrollBar.add(slGreen, 1, 1); //Green ��ũ�ѹ� add
		paneForScrollBar.add(new Label("Blue"), 0, 2);
		paneForScrollBar.add(slBlue, 1, 2); //Blue ��ũ�ѹ� add
		paneForScrollBar.add(new Label("Opacity"), 0, 3);
		paneForScrollBar.add(slOpacity, 1, 3); //Opacity ��ũ�ѹ� add

		BorderPane pane = new BorderPane();
		pane.setTop(paneForText);
		pane.setCenter(paneForScrollBar);

		Scene scene = new Scene(pane, 400, 250);
		primaryStage.setTitle("Show Colors");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// text color ����
	private void setColor() {
		text.setFill(new Color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(), slOpacity.getValue()));
	}
}