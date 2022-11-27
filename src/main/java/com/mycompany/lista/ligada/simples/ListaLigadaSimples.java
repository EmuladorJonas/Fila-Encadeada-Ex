/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista.ligada.simples;

import static com.mycompany.lista.ligada.simples.Jogo.Jogo;
import javax.swing.JOptionPane;

/**
 *
 * @author JONAS
 */
public class ListaLigadaSimples {

    public static void main(String[] args) {
        
        ListaLigada lista = new ListaLigada();
        int i;
        int n = 20;
        int r;
        int posi;
        String nome, endereco, CPF, telefone, retiradas;
        Pessoa atual;
        
        retiradas = JOptionPane.showInputDialog("JOGO DO JOSÉ!!! \n A RODA TEM 20 PESSOAS!!! \n INFORME O NUMERO DE RETIRADAS: " );
        r = Integer.parseInt(retiradas);
        
        for(i=1; i<=20; i++)
        {
            nome = "Nome_" + i;
            endereco = "Endereco_" + i;
            CPF = "CPF_" + i;
            telefone = "Telefone_" + i;
            Pessoa p = new Pessoa(nome, endereco, CPF, telefone);
            lista.adiciona(p);
        }
        posi = Jogo(n,r);
        
        
            atual = (Pessoa)lista.pega(posi-1);
            System.out.println("----------");
            System.out.println("O Sobrevivente é a Pessoa..: "+(posi));
            System.out.println("Nome..: "+atual.nome);
            System.out.println("Endereco..: "+atual.endereco);
            System.out.println("CPF..: "+atual.CPF);
            System.out.println("Telefone..: "+atual.telefone);
            System.out.println("----------");
        }
        
        
    }

