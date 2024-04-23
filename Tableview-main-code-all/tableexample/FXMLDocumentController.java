 
package tableexample;

import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
 
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<TableData> table1;
    @FXML
    private TableColumn<TableData, String> name1;
    @FXML
    private TableColumn<TableData, Integer> age1;
    
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    
    
    
        public ObservableList<TableData> addTableData() {

        ObservableList<TableData> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM rajshahi";

        connect = database.connectDb();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            TableData tableD;

            while (result.next()) {
                tableD = new TableData(
                        result.getString("name"),
                        result.getInt("age"));
                listData.add(tableD);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
        
    private ObservableList<TableData> addTableList;

    public void addTableShowListData() {
        addTableList = addTableData();

        name1.setCellValueFactory(new PropertyValueFactory<>("name"));
        age1.setCellValueFactory(new PropertyValueFactory<>("age"));

        table1.setItems(addTableList);

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addTableShowListData();
    }    
    
}
