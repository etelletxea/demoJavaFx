package com.example.demojavafx;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonaController implements Initializable{
    @FXML
    private Button btnAgregar;


    // Estaría bien tambien private TableColumn colApellidos;
    // Ya que la TableView es de persona y en la vista el tablecolumn se ha asociado con la tableview
    @FXML
    private TableColumn<Persona, ?> colApellidos;

    @FXML
    private TableColumn<Persona, ?> colEdad;

    @FXML
    private TableColumn<Persona, ?> colNombre;

    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    private ObservableList<Persona> personas;
    

    @FXML
    void agregarPersona(ActionEvent event) {
        try {
            // Obtengo los datos del formulario
            String nombre = this.txtNombre.getText();
            String apellidos = this.txtApellidos.getText();
            int edad = Integer.parseInt(this.txtEdad.getText());

            // Creo una persona
            Persona p = new Persona(nombre, apellidos, edad);

            // Compruebo si la persona esta en el lista
            if (!this.personas.contains(p)) {

                // Lo añado a la lista
                this.personas.add(p);

                // Seteo los items
                this.tblPersonas.setItems(personas);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("La persona ya existe");
                alert.showAndWait();
            }
        } catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // creo el observablelist e inserto personas en la lista
        personas= FXCollections.observableArrayList(
                new Persona("Isabel", "Allende",45),
                new Persona("William", "Hurt", 33),
                new Persona("Robin", "Williams", 24),
                new Persona("Emma", "Johnson", 44),
                new Persona("Vicky", "Luengo", 65)
        );

        //Asocio el campo de la columna con el atributo de la clase Persona
        // Hay que tener en cuenta que la TableView es de Persona -- ver definición
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));

        // Setea los datos en la tabla
        this.tblPersonas.setItems(personas);
    }
}
