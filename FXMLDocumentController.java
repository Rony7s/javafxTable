package mytable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<Sdata> tablex;
    @FXML
    private TableColumn<Sdata, String> namex;
    @FXML
    private TableColumn<Sdata, Integer> agex;
    
    
    public ObservableList<Sdata> list = FXCollections.observableArrayList(
			new Sdata("Rony Ahmmed", 22),
			new Sdata("Tanziful Islam", 23),
			new Sdata("Farana Ety",21)
			);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        namex.setCellValueFactory(new PropertyValueFactory<Sdata, String>("name"));
	agex.setCellValueFactory(new PropertyValueFactory<Sdata, Integer>("age"));
	tablex.setItems(list);
    }    
    
}
