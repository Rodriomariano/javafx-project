package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegistrarCarrosComprados {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfCpf;
    @FXML
    private TextField txfEndreco;
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfAno;
    @FXML
    private TextField txfMarca;
    @FXML
    private TextField txfModelo;





    public void onActionCadastrar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String cpf = txfCpf.getText();
        String endereco = txfEnderco.getText();
        String placa = txfPlaca.getText();
        String ano = txfAno.getText();
        String marca = txfMarca.getText();
        String modelo =txfModelo.getText();
        
        
       
        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(cpf);
        System.out.println(endereco);
        System.out.println(placa);
        System.out.println(ano);
        System.out.println(marca);
        System.out.println(modelo);

    }

}

