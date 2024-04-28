package com.example.demojavafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    ObservableList<Persona> data = FXCollections.observableArrayList(
            new Persona("Isabel", "Allende",45),
            new Persona("William", "Hurt", 33),
            new Persona("Robin", "Williams", 24),
            new Persona("Emma", "Johnson", 44),
            new Persona("Vicky", "Luengo", 65)
    );
    @Override
    public void start(Stage stage) throws IOException {
        ;
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PersonaVista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Mantenimiento de Personas");
        stage.setScene(scene);
        stage.show(); */


        //Opcion 1 -- Crear toda la interfaz desde Java
        /*
        Label label = new Label("Introduce tu nombre: ");
        TextField textField = new TextField();
        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");
        Label message =new Label();
        message.setStyle("-fx-text-fill: #0004ff; ");

        sayHelloBtn.setOnAction(actionEvent -> {
            String name= textField.getText();
            if (name.trim().length()>0)  message.setText("Hello "+name);
            else message.setText("Hello!! ");});

        exitBtn.setOnAction(actionEvent -> Platform.exit());

        VBox root =new VBox();
        root.setSpacing(5);
        root.getChildren().addAll(label,textField,message,sayHelloBtn,exitBtn);
        Scene escena=new Scene(root,350,150);
        stage.setScene(escena);
        stage.setTitle("Mi App");
        stage.show();
        */

    }

    public static void main(String[] args) {
        launch();
    }
}