package pl.edu.wsiz.lab3;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML private TableColumn col_imie; 
    @FXML private TableColumn col_nazwisko; 
    @FXML private TableView tabela;
    
    @FXML public void initialize(){
    col_imie.setCellValueFactory(
            new PropertyValueFactory<>("imie"));
    col_nazwisko.setCellValueFactory(
            new PropertyValueFactory<>("nazwisko"));
    
    
    ObservableList<Osoba> lista=FXCollections.observableArrayList();
    
    //dodaj elementy listy
    tabela.getItems().addAll(lista);
    }
    
}
