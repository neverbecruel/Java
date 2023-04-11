package com.example.operadoresarit;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundImage;

public class HelloController {

    @FXML Label lblSoma;
    @FXML Label lblDiv;
    @FXML Label lblSub;
    @FXML Label lblMulti;
    @FXML Label lblIncr;
    @FXML Label lblExpoe;
    @FXML TextField soma1;
    @FXML TextField soma2;
    @FXML TextField sub1;
    @FXML TextField sub2;
    @FXML TextField multi1;
    @FXML TextField multi2;
    @FXML TextField incremento;
    @FXML TextField base;
    @FXML TextField expoente;
    @FXML TextField div1;
    @FXML TextField div2;
    @FXML Button calculasTodos;

    @FXML
    protected void calculando() {
        lblSoma.setText(String.valueOf(Integer.parseInt(soma1.getText()) + Integer.parseInt(soma2.getText())));
        lblSub.setText(String.valueOf(Integer.parseInt(sub1.getText()) - Integer.parseInt(sub2.getText())));
        lblMulti.setText(String.valueOf(Integer.parseInt(multi1.getText()) * Integer.parseInt(multi2.getText())));
        lblDiv.setText(String.valueOf(Integer.parseInt(div1.getText()) / Integer.parseInt(div2.getText())));
        int increm = Integer.parseInt(incremento.getText());
        lblIncr.setText(String.valueOf(++increm));
        lblExpoe.setText(String.valueOf(Math.pow(Integer.parseInt(base.getText()), Integer.parseInt(expoente.getText()))));
    }
}