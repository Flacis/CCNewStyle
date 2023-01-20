package com.flacis.cc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private ComboBox<String> from;

    @FXML
    private ComboBox<String> in;

    @FXML
    private TextField result;

    @FXML
    void initialize() {
        input(from);
        input(in);

    }

    public void input(ComboBox<String> item) {
        ObservableList<String> list = FXCollections.observableArrayList(Currency.currency);
        item.setItems(list);
    }
}
