package com.example.lab18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Window;

public class Lab18Controller {
    @FXML
    private Button Button1;

    @FXML
    private TextField TextField1;

    @FXML
    private TextArea TextArea1;

    @FXML
    private void ButtonClick(ActionEvent eventOne){
        TextArea1.appendText("Your message: " + TextField1.getText() + "\n");
        TextField1.setText("");
        TextField1.requestFocus();
    }
}