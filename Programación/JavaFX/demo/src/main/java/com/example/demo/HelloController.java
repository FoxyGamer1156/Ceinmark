package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;


public class HelloController {
    @FXML
    private TextArea primer_num;

    @FXML
    private TextArea segundo_num;

    @FXML
    private TextField resultado;

    @FXML
    protected void sumar(ActionEvent sumar){
        Double num1 = Double.parseDouble(primer_num.getText());
        Double num2 = Double.parseDouble(segundo_num.getText());
        segundo_num.setStyle(primer_num.getStyle());
        Double result = num1 + num2;
        resultado.setText(String.valueOf(num1)+" + "+String.valueOf(num2)+" = "+String.valueOf(result));
    }
    @FXML
    protected void restar(ActionEvent restar){
        Double num1 = Double.parseDouble(primer_num.getText());
        Double num2 = Double.parseDouble(segundo_num.getText());
        segundo_num.setStyle(primer_num.getStyle());
        Double result = num1 - num2;
        resultado.setText(String.valueOf(num1)+" - "+String.valueOf(num2)+" = "+String.valueOf(result));

    }
    @FXML
    protected void multiplicar(ActionEvent multiplicar){
        Double num1 = Double.parseDouble(primer_num.getText());
        Double num2 = Double.parseDouble(segundo_num.getText());
        segundo_num.setStyle(primer_num.getStyle());
        Double result = num1 * num2;
        resultado.setText(String.valueOf(num1)+" * "+String.valueOf(num2)+" = "+String.valueOf(result));
    }
    @FXML
    protected void dividir(ActionEvent dvidir){
        Double num1 = Double.parseDouble(primer_num.getText());
        Double num2 = Double.parseDouble(segundo_num.getText());
        if(Double.parseDouble(segundo_num.getText())!=0){
            segundo_num.setStyle(primer_num.getStyle());
            Double result = num1 / num2;
            resultado.setText(String.valueOf(num1)+" / "+String.valueOf(num2)+" = "+String.valueOf(result));
        }else{
            segundo_num.setStyle("-fx-control-inner-background: yellow;");
            segundo_num.requestFocus();
        }
    }
}
