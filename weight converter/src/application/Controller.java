package application;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Controller implements Initializable {
	HashMap<String, Double>weight;
	weight_values w;
	
	@FXML
	private Button convert;
	@FXML
	private TextField inputweight;
	@FXML
	private ChoiceBox<String>inputtype;
	@FXML
	private Label output;
	@FXML
	private ChoiceBox<String>outputtype;
	@FXML
	private Label typeofconversion;
	
	private String types[];
	
	@FXML
	private void convert(ActionEvent e) {
		String s=inputweight.getText();
		if(s==null||s.trim().isEmpty()) {
			return;
		}
		String a=inputtype.getValue();
		if(a==null||a.trim().isEmpty()) {
			return;
		}
		String b=outputtype.getValue();
		if(b==null||b.trim().isEmpty()) {
			return;
		}
		double one=weight.get(a);
		double two=weight.get(b);
		double we=Double.parseDouble(s);
		double ans=we*two/one;
		output.setText(String.valueOf(ans));
		typeofconversion.setText("From "+a+" to "+b);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		w=new weight_values();
		weight=w.getWeights();
		types=new String[] {
				"Kilogram",
				"Gram",
				"Milligram",
				"Microgram",
				"Tonne",
				"Imperial ton",
				"US ton",
				"Stone",
				"Pound",
				"Ounce"
		};
		inputtype.getItems().addAll(types);
		outputtype.getItems().addAll(types);
		output.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5), new Insets(0))));
		output.setStyle("-fx-border-color: lightgrey;"+"-fx-border-radius: 5px;");
	}
}
