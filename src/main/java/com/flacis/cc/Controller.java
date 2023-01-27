package com.flacis.cc;

import java.net.URL;
import java.util.ResourceBundle;

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

        convert.setOnAction(actionEvent -> {
            if (!from.getSelectionModel().isEmpty() && !in.getSelectionModel().isEmpty()) {
                if (!amount.getText().isEmpty()) {
                    if (from.getSelectionModel().getSelectedItem().equals("RUB")) {
                        if (in.getSelectionModel().getSelectedItem().equals("USD")) {
                            result.setText(String.valueOf(RUB.USD(Double.parseDouble(amount.getText()))));
                        } else if (in.getSelectionModel().getSelectedItem().equals("EUR")) {
                            result.setText(String.valueOf(RUB.EUR(Double.parseDouble(amount.getText()))));
                        } else {
                            result.setText(amount.getText());
                        }
                    }
                    if (from.getSelectionModel().getSelectedItem().equals("USD")) {
                        if (in.getSelectionModel().getSelectedItem().equals("RUB")) {
                            result.setText(String.valueOf(USD.RUB(Double.parseDouble(amount.getText()))));
                        } else if (in.getSelectionModel().getSelectedItem().equals("EUR")) {
                            result.setText(String.valueOf(USD.EUR(Double.parseDouble(amount.getText()))));
                        } else {
                            result.setText(amount.getText());
                        }
                    }
                    if (from.getSelectionModel().getSelectedItem().equals("EUR")) {
                        if (in.getSelectionModel().getSelectedItem().equals("USD")) {
                            result.setText(String.valueOf(EUR.USD(Double.parseDouble(amount.getText()))));
                        } else if (in.getSelectionModel().getSelectedItem().equals("RUB")) {
                            result.setText(String.valueOf(EUR.RUB(Double.parseDouble(amount.getText()))));
                        } else {
                            result.setText(amount.getText());
                        }
                    }
                } else {
                    result.setText("AMOUNT IS EMPTY");
                }
            } else {
                result.setText("FROM OR IN IS EMPTY");
            }
        });
    }

    public void input(ComboBox<String> item) {
        ObservableList<String> list = FXCollections.observableArrayList(Currency.currency);
        item.setItems(list);
    }
}
