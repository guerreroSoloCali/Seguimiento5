package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Student;
import model.StudentData;

public class VentanaB implements Initializable {

	public String name;
	public String code;
	public int id;
	public int ingreso;
	public int gasto;
	public float total;
	
    @FXML
    private TextField codeTF;

    @FXML
    private TextField idTF;

    @FXML
    private TextField nameTF;

    @FXML
    private Button registerBTN;
    
    @FXML
    private TextField gastoUsu;

    @FXML
    private TextField ingreUsu;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

    
    @FXML
    void registerStudent(ActionEvent event) throws Exception {
    	name = nameTF.getText();
		code = codeTF.getText();
		id = Integer.parseInt(idTF.getText());
		ingreso = Integer.parseInt(ingreUsu.getText());
		gasto = Integer.parseInt(gastoUsu.getText());
		
    	Student student = new Student(this.name, this.code, this.id, this.ingreso, this.gasto, this.total);
    	StudentData.data.add(student);
    	
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
    }
   

	

}