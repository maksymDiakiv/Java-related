package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button mult;
    @FXML
    private Button div;
    @FXML
    private Button eq;
    @FXML
    private TextField txtfield;

    String op = "";
    long number1;
    long number2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Number(ActionEvent actionEvent){
        String no = ((Button)actionEvent.getSource()).getText();
        txtfield.setText(txtfield.getText() + no);
    }
    public void Operation(ActionEvent actionEvent){
        String operation = ((Button)actionEvent.getSource()).getText();

        if (!operation.equals("=")){
            if (!op.equals("")){
                return;
            }
            op = operation;
            number1 = Long.parseLong(txtfield.getText());
            txtfield.setText("");
        }else {
            if (op.equals("")){
                return;
            }
            number2 = Long.parseLong(txtfield.getText());
            calculate(number1,number2,op);
            op = "";
        }
    }
    public void calculate(long n1, long n2, String op){
        switch (op){
            case "+": txtfield.setText(n1 + n2 + "");break;
            case "-": txtfield.setText(n1 - n2 + "");break;
            case "*": txtfield.setText(n1 * n2 + "");break;
            case "/":
                if (n2 == 0){
                    txtfield.setText("0");break;
                }
                txtfield.setText(n1 / n2 + "");break;
        }
    }
}