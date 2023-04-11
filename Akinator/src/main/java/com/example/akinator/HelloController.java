package com.example.akinator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    public Button btnChute;
    public ImageView sim;
    @FXML
    private Label lblAkinator;
    @FXML
    private Spinner spinner;


    @FXML
    protected void eoChutas() {

        int n1 = Math.toIntExact(Math.round(Math.random() * 10));
        int tent = (int) spinner.getValue();
        if (tent == n1){
            lblAkinator.setText("Parabéns, você acertou!!!");
        }
        else {
            lblAkinator.setText(String.format("Burro!!! KKKKKK Eu tava pensando em %d", n1));
        }
        //(n1 == tent)?lblAkinator.setText("Parabéns, você acertou!!"):lblAkinator.setText("Burro!! KKKKKKKKKKKK");

       // lblAkinator.setText(String.format("O número que estou pensando é: %d", n1));

    }
}