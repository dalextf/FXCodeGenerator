package dad.codegen.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BeanController implements Initializable {
	
	// view
	
    @FXML
    private GridPane view;

    @FXML
    private TextField nombreText;

    @FXML
    private ComboBox<?> padreCombo;

    @FXML
    private Button quitarPadreButton;

    @FXML
    private TableView<?> propiedadesList;

    @FXML
    private TableColumn<?, ?> nombreColumn;

    @FXML
    private TableColumn<?, ?> soloLecturaColumn;

    @FXML
    private TableColumn<?, ?> tipoColumn;

    @FXML
    private TableColumn<?, ?> genericoColumn;

    @FXML
    private Button nuevaPropiedadButton;

    @FXML
    private Button eliminarPropiedadButton;

    @FXML
    private Button editarPropiedadButton;
    
    public BeanController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/BeanView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public GridPane getView() {
		return view;
	}
	
    @FXML
    void onEditarPropiedadAction(ActionEvent event) {
    	// TODO editar la propiedad seleccionada
    }

    @FXML
    void onEliminarPropiedadAction(ActionEvent event) {
    	// TODO eliminar la propiedad seleccionada
    }

    @FXML
    void onNuevaPropiedadAction(ActionEvent event) {
    	// TODO añadir una nueva propiedad
    }

    @FXML
    void onQuitarPadreAction(ActionEvent event) {
    	// TODO quitar el padre del combo
    }

}
