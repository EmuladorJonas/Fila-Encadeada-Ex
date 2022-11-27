/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.ligada.simples;

/**
 *
 * @author JONAS
 */
public class Pessoa {
    String nome;
    String endereco;
    String telefone;
    String CPF;
    // double telefone, CPF; real variaveis.
    
    public Pessoa(String nome, String endereco, String telefone, String CPF)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
