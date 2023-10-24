package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class CadastrarNovosCarros {
    @FXML
    private TextField txfCidade;
    @FXML
    private TextField txfEstado;
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfAno;
    @FXML
    private TextField txfFabricante;
    @FXML
    private CheckBox ckbNovo;
    @FXML
    private CheckBox ckbSeminovo;
    @FXML
    private CheckBox ckbUsado;
    @FXML
    private CheckBox ckbSedan;
    @FXML
    private CheckBox ckbHatch;
    @FXML
    private CheckBox ckbSuv;
    @FXML
    private CheckBox ckbAutomatico;
    @FXML
    private CheckBox ckbManual;

    public void onActionCadastrar() {
        String cidade = txfCidade.getText();
        String estado = txfEstado.getText();
        String placa = txfPlaca.getText();
        String ano = txfAno.getText();
        String cor = txfCor.getText();
        String fabricante = txfFabricante.getText();
        Boolean novo = ckbNovo.getText();
        Boolean seminovo = ckbSeminovo.getText();
        Boolean usado = ckbUsado.isSelected();
        Boolean sedan = ckbSedan.isSelected();
        Boolean hatch = ckbHatch.isSelected();
        Boolean suv = ckbSuv.isSelected();
        Boolean automatico = ckbAutomatico.isSelected();
        Boolean manual = ckbManual.isSelected();

        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(placa);
        System.out.println(ano); 
        System.out.println(fabricante);
        System.out.println(novo);
        System.out.println(semi-novo);
        System.out.println(usado); 
        System.out.println(sedan);
        System.out.println(hatch);
        System.out.println(suv);         
        System.out.println(cor);
        System.out.println(automatico);
        System.out.println(manual);





    }

}