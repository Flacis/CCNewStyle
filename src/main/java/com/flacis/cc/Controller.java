package com.flacis.cc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField amount;

    @FXML
    private Button convert;

    @FXML
    private ComboBox<?> from;

    @FXML
    private ComboBox<?> in;

    @FXML
    private TextField result;

    @FXML
    void initialize() {
        assert amount != null : "fx:id=\"amount\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert convert != null : "fx:id=\"convert\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert from != null : "fx:id=\"from\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert in != null : "fx:id=\"in\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'converter-view.fxml'.";

    }

}
